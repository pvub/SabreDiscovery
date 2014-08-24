
package com.pvub.sabre.messages;

/**
 *
 * @author pvub
 */
public class SabreTokenResponse {
    
    private String  access_token;
    private String  token_type;
    private Integer expires_in;

    // Getters and setters are not required for this example.
    // GSON sets the fields directly using reflection.

    @Override
    public String toString() {
        return getAccess_token() + " - " + getToken_type() + "-" + getExpires_in();
    }

    /**
     * @return the access_token
     */
    public String getAccess_token() {
        return access_token;
    }

    /**
     * @param access_token the access_token to set
     */
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * @return the token_type
     */
    public String getToken_type() {
        return token_type;
    }

    /**
     * @param token_type the token_type to set
     */
    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    /**
     * @return the expires_in
     */
    public Integer getExpires_in() {
        return expires_in;
    }

    /**
     * @param expires_in the expires_in to set
     */
    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }
    
}
