/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.discovery;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import static com.pvub.sabre.discovery.SabreRequestHandler.getString;
import com.pvub.sabre.model.InstaFlightItenaries;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import com.pvub.sabre.lpc.model.LeadPriceCalendar;
import com.pvub.sabre.lpc.model.FareInfo;
import com.pvub.sabre.json.adapter.DoubleTypeAdapter;
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */
public class SabreLeadPriceCalendarRequestHandler extends SabreRequestHandler 
{
    
    public LeadPriceCalendar getLeadPrice(String token, LeadPriceCalendarSearchParameters params)
            throws IOException
    {
        LeadPriceCalendar calendar = null;
        
        URL url = new URL(SABRE_REST_SERVICE_URL + SABRE_LEADPRICECALENDAR_ENDPOINT + "?" + params.getQueryString());
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        connection.setHostnameVerifier(new BrowserCompatHostnameVerifier());
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

        connection.setRequestProperty("Authorization", "Bearer " + token);

        connection.setUseCaches(false);
        //connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setRequestMethod("GET");
        
        connection.connect();

        //DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        //wr.writeBytes(INSTAFLIGHTS_EXAMPLE);
        //wr.flush();
        //wr.close();

        // Uncomment for debug
        int responseCode = -1;
        String response = "";
        String errorText = "";

        try {
            responseCode = connection.getResponseCode();
            response = getString(connection.getInputStream());
        } catch (Exception e)
        {
            responseCode = connection.getResponseCode();
            errorText = getString(connection.getErrorStream());
        }
        finally {
            connection.disconnect();
        }
        
        if (responseCode != 200)
        {
            System.out.println("Lead Price Calendar request failed with responseCode: " + responseCode);
            System.out.println("Lead Price Calendar request error text: " + errorText);
        }
        else
        {
            //System.out.println("Lead Price Calendar Return: " + response);
        }
        
        if (response.length() > 0)
        {
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(Double.class, new DoubleTypeAdapter());
            Gson gson = builder.create();
            calendar = gson.fromJson(response, LeadPriceCalendar.class);
            List<FareInfo> fares = calendar.getFareInfo();
            System.out.println("Number of Fares: " + calendar.getFareInfo().size());
            List<FareInfo> valid = getValidFares(fares);
            System.out.println("Valid: " + valid.size());
            FareInfo lowest = getLowestNonstopFare(valid, 3);
            if (lowest != null)
            {
                System.out.println("Departure: " + lowest.getDepartureDateTime());
                System.out.println("Arrival: " + lowest.getReturnDateTime());
                System.out.println("Price: " + lowest.getLowestNonStopFare());
                System.out.println("Link: " + lowest.getLinks().get(0).toString());
            }
            lowest = getLowestNonstopFare(valid, 4);
            if (lowest != null)
            {
                System.out.println("Departure: " + lowest.getDepartureDateTime());
                System.out.println("Arrival: " + lowest.getReturnDateTime());
                System.out.println("Price: " + lowest.getLowestNonStopFare());
                System.out.println("Link: " + lowest.getLinks().get(0).toString());
            }
        }
        
        return calendar;
    }    
    
    private List<FareInfo> getValidFares(List<FareInfo> fares)
    {
        List<FareInfo> valid = new ArrayList<FareInfo>();
        for (FareInfo info : fares)
        {
            if (info.getLowestNonStopFare() != null)
            {
                valid.add(info);
            }
        }
        return valid;
    }
    
    private FareInfo getLowestNonstopFare(List<FareInfo> fares, Integer lengthOfStay)
    {
        Double price = new Double(Double.MAX_VALUE);
        FareInfo lowest = null;
        for (FareInfo info : fares)
        {
            DateTime start = DateTime.parse(info.getDepartureDateTime());
            DateTime end = DateTime.parse(info.getReturnDateTime());
            Days days = Days.daysBetween(start, end);
            if (info.getLowestNonStopFare() < price && days.getDays() == lengthOfStay.intValue())
            {
                price = info.getLowestNonStopFare();
                lowest = info;
            }
        }
        return lowest;
    }
}
