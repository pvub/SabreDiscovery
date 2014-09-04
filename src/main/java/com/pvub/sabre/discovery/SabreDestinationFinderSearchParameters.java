/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.discovery;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */
public class SabreDestinationFinderSearchParameters {

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the departuredate
     */
    public String getDeparturedate() {
        return departuredate;
    }

    /**
     * @param departuredate the departuredate to set
     */
    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }

    /**
     * @return the returndate
     */
    public String getReturndate() {
        return returndate;
    }

    /**
     * @param returndate the returndate to set
     */
    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    /**
     * @return the earliestdeparturedate
     */
    public String getEarliestdeparturedate() {
        return earliestdeparturedate;
    }

    /**
     * @param earliestdeparturedate the earliestdeparturedate to set
     */
    public void setEarliestdeparturedate(String earliestdeparturedate) {
        this.earliestdeparturedate = earliestdeparturedate;
    }

    /**
     * @return the latestdeparturedate
     */
    public String getLatestdeparturedate() {
        return latestdeparturedate;
    }

    /**
     * @param latestdeparturedate the latestdeparturedate to set
     */
    public void setLatestdeparturedate(String latestdeparturedate) {
        this.latestdeparturedate = latestdeparturedate;
    }

    /**
     * @return the lengthofstay
     */
    public Integer getLengthofstay() {
        return lengthofstay;
    }

    /**
     * @param lengthofstay the lengthofstay to set
     */
    public void setLengthofstay(Integer lengthofstay) {
        this.lengthofstay = lengthofstay;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme the theme to set
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return the minfare
     */
    public String getMinfare() {
        return minfare;
    }

    /**
     * @param minfare the minfare to set
     */
    public void setMinfare(String minfare) {
        this.minfare = minfare;
    }

    /**
     * @return the maxfare
     */
    public String getMaxfare() {
        return maxfare;
    }

    /**
     * @param maxfare the maxfare to set
     */
    public void setMaxfare(String maxfare) {
        this.maxfare = maxfare;
    }

    /**
     * @return the pointofsalecountry
     */
    public String getPointofsalecountry() {
        return pointofsalecountry;
    }

    /**
     * @param pointofsalecountry the pointofsalecountry to set
     */
    public void setPointofsalecountry(String pointofsalecountry) {
        this.pointofsalecountry = pointofsalecountry;
    }

    /**
     * @return the type
     */
    public FinderType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(FinderType type) {
        this.type = type;
    }
    
    public enum FinderType
    {
        // Provide a single set of round-trip travel dates (in departuredate and returndate). 
        // You can pass any single departure date from the current date to the current date + 192. 
        // You can pass any single return date that is equal to or later than the departure date, 
        // that does not exceed the maximum length of stay. (Length of stay is 0–16.)
        WITH_DATES,
        // Provide a single length of stay (in lengthofstay) without any dates. 
        // The API retrieves lead fares for 30 consecutive dates that begin on the current date. 
        // To calculate return dates, the API adds lengthofstay to the departure date, 
        // where lengthofstay is 0–16.
        WITH_LENGTH_OF_STAY,
        // Provide a length of stay (of 0–16 days) with earliest and latest departure dates 
        // (in earliestdeparturedate and latestdeparturedate). 
        // For earliestdeparturedate, the date can begin with today's date. 
        // The latestdeparturedate can begin on today's date + 192, 
        // but the span of departure dates cannot exceed 30 days. 
        // The length of stay is from 0–16. The API retrieves lead fares for 
        // each departure date in your range, and calculates the return date by 
        // adding the lengthofstay to the departure date.
        WITH_DATES_AND_STAY
        
    }
    
    private FinderType type;
    
    // 3-letter IATA code of the departure airport
    private String origin;

    // Format: YYYY-MM-DD
    private String departuredate;

    // Format: YYYY-MM-DD
    private String returndate;

    // Format: YYYY-MM-DD. The earliest date of departure in the range. 
    // The date can be a maximum of 90 days in the future, including the day of the request.
    private String earliestdeparturedate;

    // Format: YYYY-MM-DD. The latest date of departure in the range. 
    // The date can be a maximum of 90 days in the future, including the day of the request.
    private String latestdeparturedate;

    // Valid values: 0 to 16, inclusive
    private Integer lengthofstay;

    // 2 letter ISO country code
    private String location;

    // A travel theme to filter a list of destinations
    private String theme;

    // Minimum overall lead fare.
    private String minfare;

    // Maximum overall lead fare.
    private String maxfare;

    // 2-letter country code of the point of sale
    private String pointofsalecountry;

    public String getQueryString()
    {
        StringBuilder sb = new StringBuilder();
        if (getOrigin() != null) sb.append("origin=").append(getOrigin()).append("&");
        if (type == FinderType.WITH_DATES)
        {
            if (getDeparturedate() != null) sb.append("departuredate=").append(getDeparturedate()).append("&");
            if (getReturndate() != null) sb.append("returndate=").append(getReturndate()).append("&");
        }
        if (type == FinderType.WITH_LENGTH_OF_STAY)
        {
            if (getLengthofstay() != null) sb.append("lengthofstay=").append(getLengthofstay()).append("&");
        }
        if (type == FinderType.WITH_DATES_AND_STAY)
        {
            if (getLengthofstay() != null) sb.append("lengthofstay=").append(getLengthofstay()).append("&");
            if (getEarliestdeparturedate() != null) sb.append("earliestdeparturedate=").append(getEarliestdeparturedate()).append("&");
            if (getLatestdeparturedate() != null) sb.append("latestdeparturedate=").append(getLatestdeparturedate()).append("&");
        }
        if (getTheme() != null) sb.append("theme=").append(getTheme()).append("&");
        if (getLocation() != null) sb.append("location=").append(getLocation()).append("&");
        if (getMinfare() != null) sb.append("minfare=").append(getMinfare()).append("&");
        if (getMaxfare() != null) sb.append("maxfare=").append(getMaxfare());
        return sb.toString();
    }
}
