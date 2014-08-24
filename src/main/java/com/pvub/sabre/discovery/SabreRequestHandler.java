/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pvub.sabre.discovery;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.Base64;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;

import com.pvub.sabre.messages.SabreTokenResponse;
import com.pvub.sabre.model.InstaFlightItenaries;

/**
 *
 * @author pvub
 */
public class SabreRequestHandler {
    
    protected final String SABRE_REST_SERVICE_URL = "https://api.test.sabre.com";
    
    protected final String SABRE_INSTAFLIGHTS_ENDPOINT = "/v1/shop/flights";
    protected final String SABRE_LEADPRICECALENDAR_ENDPOINT = "/v1/shop/flights/fares";
    protected final String SABRE_AUTH_ENDPOINT = "/v1/auth/token";
    
    protected final String SABRE_GRANT_TYPE = "grant_type=client_credentials";
    protected final String SABRE_CLIENT_ID = "V1:mh5cta2h15qmigwp:DEVCENTER:EXT";
    protected final String SABRE_CLIENT_SECRET = "1F1BCdrt";
    
    protected final String INSTAFLIGHTS_EXAMPLE = "origin=DTW&destination=ATL&departuredate=2014-09-03&returndate=2014-09-12";
        
    public void SabreRequestHandler()
    {
    }

    protected static String getString(InputStream stream) throws IOException
    {
        StringBuilder contents = new StringBuilder(2048);
        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new InputStreamReader(stream));
            String line = "";
            while (line != null)
            {
                line = br.readLine();
                if (line != null)
                {
                    contents.append(line);
                }
            }
        }
        finally
        {
            close(br);
        }

        return contents.toString();
    }

    protected static void close(Reader br)
    {
        try
        {
            if (br != null)
            {
                br.close();
            }
        }
        catch (Exception e)
        {
            // Ignore
            e.printStackTrace();
        }
    }

}
