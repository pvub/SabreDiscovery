/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.discovery;

import java.io.IOException;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */
public class AuthenticationManager {

    private SabreAuthenticationHandler handler = null;
    private String                     token = null;
    
    public AuthenticationManager()
    {
        handler = new SabreAuthenticationHandler();
    }
    
    public void authenticate()
    {
        try
        {
            token = handler.getTokenString();
        }
        catch (IOException e)
        {
            System.out.println("Exception obtaining token: " + e.getMessage());
        }
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }
}
