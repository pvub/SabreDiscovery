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
public class LeadPriceCalendarSearchParameters {
    // 3-letter IATA airport code or city code of the departure airport
    private String origin;

    // 3-letter IATA airport code or city code of the arrival airport
    private String destination;
    
    //Duration of the stay or trip, in days
    //
    //You can request a single length of stay value (LOS) or multiple LOS values separated with a comma.
    //
    //Multiple values can be consecutive or non-consecutive.
    //
    //You can use up to 5 values.
    //
    //Valid values:  0-16
    //
    //A value of 0 returns fares with departure and arrival on the same day.
    //
    //Example:  lengthofstay=3,5,6,9,12
    private String lengthofstay;
    
    //string, optional
    //
    //Format:
    //
    //YYYY-MM-DD
    //
    //or
    //
    //YYYY-MM-DD,YYYY-MM-DD
    //
    //Date of departure
    //
    //The API searches for lead fares on the departure dates in the request
    //
    //If you do not include departuredate, the API searches for lead fares with departures on the date of the request through the next 192 days.
    //If you include departuredate, you can request a single date or multiple dates. Multiple dates can be consecutive or non-consecutive.
    //The maximum future dates that you can pass is the current date + 192.
    //
    //Examples:
    //
    //departuredate=2014-01-02
    //
    //departuredate=2014-01-02,2014-01-06
    private String departuredate;
    
    //number, optional
    //
    //Minimum overall lead fare
    //
    //Searches for overall lead fares that are equal to or greater than the minimum, and returns the value in LowestFare
    private Integer minfare;

    //number, optional
    //
    //Maximum overall lead fare
    //
    //Searches for the overall lead fares that are equal to or less than the maximum, and returns the value in LowestFare
    private Integer maxfare;
    
    public String getQueryString()
    {
        StringBuilder sb = new StringBuilder();
        if (getOrigin() != null) sb.append("origin=").append(getOrigin()).append("&");
        if (getDestination() != null) sb.append("destination=").append(getDestination()).append("&");
        if (getDeparturedate() != null) sb.append("departuredate=").append(getDeparturedate()).append("&");
        if (getLengthofstay() != null) sb.append("lengthofstay=").append(getLengthofstay()).append("&");
        if (getMinfare() != null) sb.append("minfare=").append(getMinfare()).append("&");
        if (getMaxfare() != null) sb.append("maxfare=").append(getMaxfare());
        return sb.toString();
    }

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
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the lengthofstay
     */
    public String getLengthofstay() {
        return lengthofstay;
    }

    /**
     * @param lengthofstay the lengthofstay to set
     */
    public void setLengthofstay(String lengthofstay) {
        this.lengthofstay = lengthofstay;
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
     * @return the minfare
     */
    public Integer getMinfare() {
        return minfare;
    }

    /**
     * @param minfare the minfare to set
     */
    public void setMinfare(Integer minfare) {
        this.minfare = minfare;
    }

    /**
     * @return the maxfare
     */
    public Integer getMaxfare() {
        return maxfare;
    }

    /**
     * @param maxfare the maxfare to set
     */
    public void setMaxfare(Integer maxfare) {
        this.maxfare = maxfare;
    }
}