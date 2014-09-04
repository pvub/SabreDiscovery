package com.pvub.sabre.discovery;

import com.pvub.sabre.model.InstaFlightItenaries;
import java.io.IOException;
import java.lang.StringBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AuthenticationManager auth = new AuthenticationManager();
        try
        {
            auth.authenticate();
            System.out.println("Token: " + auth.getToken());
            
            String token = auth.getToken();
            if (token != null)
            {
                //getInstaFlightResults(token);
                //getLeadPriceCalendar(token);
                getDestinations(token);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void getInstaFlightResults(String token)
    {
        try 
        {
            SabreInstaFlightRequestHandler handler = new SabreInstaFlightRequestHandler();
            InstaFlightSearchParameters params = new InstaFlightSearchParameters();
            params.setOrigin("ORD");
            params.setDestination("ATL");
            params.setDeparturedate("2014-09-10");
            params.setReturndate("2014-09-14");
            params.setOutboundflightstops(0);
            params.setLimit(10);
            InstaFlightItenaries flights = handler.getInstaFlights(token, params);
            if (flights != null)
            {
                System.out.println("Number of Itenaries returned: " + flights.getPricedItineraries().size());
                StringBuilder out;
                out = new StringBuilder();
                flights.print(out);
                System.out.println(out.toString());
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void getLeadPriceCalendar(String token)
    {
        try
        {
            SabreLeadPriceCalendarRequestHandler handler = new SabreLeadPriceCalendarRequestHandler();
            LeadPriceCalendarSearchParameters params = new LeadPriceCalendarSearchParameters();
            params.setOrigin("ORD");
            params.setDestination("ATL");
            params.setLengthofstay("3,4");
            handler.getLeadPrice(token, params);
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void getDestinations(String token)
    {
        try
        {
            SabreDestinationFinderRequestHandler handler = new SabreDestinationFinderRequestHandler();
            SabreDestinationFinderSearchParameters params = new SabreDestinationFinderSearchParameters();
            params.setType(SabreDestinationFinderSearchParameters.FinderType.WITH_DATES);
            params.setOrigin("ORD");
            params.setDeparturedate("2014-09-28");
            params.setReturndate("2014-10-02");
            params.setLocation("US");
            handler.getDestinations(token, params);
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
