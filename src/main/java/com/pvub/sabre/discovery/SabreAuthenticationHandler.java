/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.discovery;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pvub.sabre.messages.SabreTokenResponse;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.joda.time.DateTime;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */
public class SabreAuthenticationHandler extends SabreRequestHandler {

    private String access_token = null;
    private DateTime expires = null;
    private Properties props = null;

    public SabreAuthenticationHandler()
    {
        LoadToken();
    }
    
    public String getTokenString() 
            throws IOException
    {
        if (   expires != null
            && expires.isAfter(DateTime.now()))
        {
            System.out.println("Returning cached");
            return this.access_token;
        }
        
        URL url = new URL(SABRE_REST_SERVICE_URL + SABRE_AUTH_ENDPOINT);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        connection.setHostnameVerifier(new BrowserCompatHostnameVerifier());
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

        String a = Base64.getEncoder().encodeToString(SABRE_CLIENT_ID.getBytes("UTF-8"));
        String b = Base64.getEncoder().encodeToString(SABRE_CLIENT_SECRET.getBytes("UTF-8"));
        String authString = (a+":"+b);
        String bauthEnc = Base64.getEncoder().encodeToString(authString.getBytes("UTF-8"));

        connection.setRequestProperty("Authorization", "Basic " + bauthEnc);

        connection.setUseCaches(false);
        //connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        
        connection.connect();

//        Certificate[] serverCerts = connection.getServerCertificates();
//        System.out.println("==Printing Certificate Chain==");
//
//        for (int i = 0; i < serverCerts.length; i++) {
//            Certificate myCert = serverCerts[i];
//            System.out.println("Cert: " + (i+1) );
//            System.out.println(myCert);
//            System.out.println();
//        }

        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        wr.writeBytes(SABRE_GRANT_TYPE);
        wr.flush();
        wr.close();

        // Uncomment for debug
        int responseCode = -1;
        String tokenJSON = "";
        String errorText = "";

        try {
            responseCode = connection.getResponseCode();
            tokenJSON = getString(connection.getInputStream());

            //if (!url.getHost().equals(urlConnection.getURL().getHost())) { show browser }
        } catch (Exception e)
        {
            responseCode = connection.getResponseCode();
            errorText = getString(connection.getErrorStream());
        }
        finally {
            connection.disconnect();
            if (responseCode != 200)
            {
                System.out.println("Authtoken request failed with responseCode: " + responseCode);
                System.out.println("Authtoken request error text: " + errorText);

            }

        }
        
        if (tokenJSON.length() > 0)
        {
            Gson gson = new GsonBuilder().create();
            SabreTokenResponse response = gson.fromJson(tokenJSON, SabreTokenResponse.class);
            System.out.println("Token string: " + response.getAccess_token() + " Expires: " + response.getExpires_in());
            access_token = response.getAccess_token();
            DateTime dt = DateTime.now();
            dt.plusSeconds(response.getExpires_in());
            expires = dt;
            SaveToken(response);
        }
        
        return access_token;
    }
    
    private void SaveToken(SabreTokenResponse response)
    {
        if (props == null)
        {
            props = new java.util.Properties();
        }
        
        DateTime dt = DateTime.now();
        System.out.println("Saving Now: " + dt);
        dt = dt.plusSeconds(response.getExpires_in());
        System.out.println("Saving Future: " + dt);
        props.setProperty("access_token", response.getAccess_token());
        props.setProperty("expires", dt.toString());
        
        try 
        {
            File f = new File("sabre.properties");
            OutputStream out = new FileOutputStream( f );
            props.store(out, "Sabre Auth Token Response");
            System.out.println("Saving token");
        }
        catch (Exception e ) {
            e.printStackTrace();
        }
    }
    
    private void LoadToken() 
    {
        props = new Properties();
        InputStream is = null;

        // First try loading from the current directory
        try 
        {
            File f = new File("sabre.properties");
            is = new FileInputStream( f );
        }
        catch ( Exception e ) { is = null; }

        try 
        {
            if ( is == null ) {
                // Try loading from classpath
                is = getClass().getResourceAsStream("sabre.properties");
            }

            // Try loading properties from the file (if found)
            props.load( is );
            this.access_token = props.getProperty("access_token");
            String exp = props.getProperty("expires");
            this.expires = DateTime.parse(exp);
            System.out.println("Loading Token: Expires: " + expires);
        }
        catch ( Exception e ) { }

    }
}
