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
//                SabreInstaFlightRequestHandler handler = new SabreInstaFlightRequestHandler();
//                InstaFlightSearchParameters params = new InstaFlightSearchParameters();
//                params.setOrigin("ORD");
//                params.setDestination("ATL");
//                params.setDeparturedate("2014-09-10");
//                params.setReturndate("2014-09-14");
//                params.setOutboundflightstops(0);
//                params.setLimit(10);
//                InstaFlightItenaries flights = handler.getInstaFlights(token, params);
//                if (flights != null)
//                {
//                    System.out.println("Number of Itenaries returned: " + flights.getPricedItineraries().size());
//                    StringBuilder out;
//                    out = new StringBuilder();
//                    flights.print(out);
//                    System.out.println(out.toString());
//                }
                SabreLeadPriceCalendarRequestHandler handler = new SabreLeadPriceCalendarRequestHandler();
                LeadPriceCalendarSearchParameters params = new LeadPriceCalendarSearchParameters();
                params.setOrigin("ORD");
                params.setDestination("ATL");
                params.setLengthofstay("3,4");
                handler.getLeadPrice(token, params);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
