/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.discovery;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pvub.sabre.model.InstaFlightItenaries;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */
public class SabreInstaFlightRequestHandler extends SabreRequestHandler {

    public InstaFlightItenaries getInstaFlights(String token, InstaFlightSearchParameters params)
            throws IOException
    {
        InstaFlightItenaries flights = null;
        
        URL url = new URL(SABRE_REST_SERVICE_URL + SABRE_INSTAFLIGHTS_ENDPOINT + "?" + params.getQueryString());
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
            System.out.println("InstaFlights request failed with responseCode: " + responseCode);
            System.out.println("InstaFlights request error text: " + errorText);
        }
        else
        {
            //System.out.println("InstaFlights Return: " + response);
        }
        
        if (response.length() > 0)
        {
            Gson gson = new GsonBuilder().create();
            flights = gson.fromJson(response, InstaFlightItenaries.class);
            System.out.println("Number of Itins: " + flights.getPricedItineraries().size());
        }
        
        return flights;
    }    
}
