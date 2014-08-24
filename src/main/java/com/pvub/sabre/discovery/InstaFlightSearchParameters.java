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
public class InstaFlightSearchParameters {

    // 3-letter IATA airport code or city code of the departure airport
    private String origin;

    // 3-letter IATA airport code or city code of the arrival airport
    private String destination;

    // Format: YYYY-MM-DD
    private String departuredate;

    // Format: YYYY-MM-DD
    private String returndate;

    // List of IATA airline codes. Format: XX,YY,ZZ
    private String includedcarriers;

    // List of IATA airline codes. Format: XX,YY,ZZ
    private String excludedcarriers;

    // Max number of flight connections. Values 0-99
    private Integer outboundflightstops;

    // List of 3 letter IATA airport codes. Format: XXX,YYY,ZZZ. Max 3 airport codes allowed.
    private String includedconnectpoints;

    // List of 3 letter IATA airport codes. Format: XXX,YYY,ZZZ. Max 3 airport codes allowed.
    private String excludedconnectpoints;

    // Max number of flight connections. Values 0-99
    private Integer inboundflightstops;

    // The sum of the total waiting time for all connections on an outbound itinerary. Values 0-9999
    private Integer outboundstopduration;

    // The sum of the total waiting time for all connections on an inbound itinerary. Values 0-9999
    private Integer inboundstopduration;

    // Time range during which a first outbound flight segment can depart on the departure date. Format: HHMMHHMM
    private String outbounddeparturewindow;

    // Time range during which a first inbound flight segment can depart on the departure date. Format: HHMMHHMM
    private String inbounddeparturewindow;

    // Time range during which a last outbound flight segment can arrive, after the departure date. Format: HHMMHHMM
    private String outboundarrivalwindow;

    // Time range during which a last inbound flight segment can arrive on the return date. Format: HHMMHHMM
    private String inboundarrivalwindow;

    // An indicator to base the response on online or interline itineraries.
    private String onlineitinerariesonly;

    // Minimum overall lead fare.
    private String minfare;

    // Maximum overall lead fare.
    private String maxfare;

    // Limit the number of itineraries returned.
    private Integer limit;

    // Retrieves the itineraries that start with the number in offset through the quantity in limit, inclusive.
    private Integer offset;

    // An indicator to only retrieve itineraries that are e-ticket eligible.
    private String eticketsonly;

    // Primary sort object in the response.
    private String sortby;

    // Sorting order for the primary sortby.
    private String order;

    // Secondary sort object in the response.
    private String sortby2;

    // Sorting order for sortby2.
    private String order2;

    // 2-letter country code of the point of sale
    private String pointofsalecountry;

    public String getQueryString()
    {
        StringBuilder sb = new StringBuilder();
        if (origin != null) sb.append("origin=").append(origin).append("&");
        if (destination != null) sb.append("destination=").append(destination).append("&");
        if (departuredate != null) sb.append("departuredate=").append(departuredate).append("&");
        if (returndate != null) sb.append("returndate=").append(returndate).append("&");
        if (includedcarriers != null) sb.append("includedcarriers=").append(includedcarriers).append("&");
        if (excludedcarriers != null) sb.append("excludedcarriers=").append(excludedcarriers).append("&");
        if (outboundflightstops != null) sb.append("outboundflightstops=").append(outboundflightstops).append("&");
        if (limit != null) sb.append("limit=").append(limit).append("&");
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
     * @return the includedcarriers
     */
    public String getIncludedcarriers() {
        return includedcarriers;
    }

    /**
     * @param includedcarriers the includedcarriers to set
     */
    public void setIncludedcarriers(String includedcarriers) {
        this.includedcarriers = includedcarriers;
    }

    /**
     * @return the excludedcarriers
     */
    public String getExcludedcarriers() {
        return excludedcarriers;
    }

    /**
     * @param excludedcarriers the excludedcarriers to set
     */
    public void setExcludedcarriers(String excludedcarriers) {
        this.excludedcarriers = excludedcarriers;
    }

    /**
     * @return the outboundflightstops
     */
    public Integer getOutboundflightstops() {
        return outboundflightstops;
    }

    /**
     * @param outboundflightstops the outboundflightstops to set
     */
    public void setOutboundflightstops(Integer outboundflightstops) {
        this.outboundflightstops = outboundflightstops;
    }

    /**
     * @return the includedconnectpoints
     */
    public String getIncludedconnectpoints() {
        return includedconnectpoints;
    }

    /**
     * @param includedconnectpoints the includedconnectpoints to set
     */
    public void setIncludedconnectpoints(String includedconnectpoints) {
        this.includedconnectpoints = includedconnectpoints;
    }

    /**
     * @return the excludedconnectpoints
     */
    public String getExcludedconnectpoints() {
        return excludedconnectpoints;
    }

    /**
     * @param excludedconnectpoints the excludedconnectpoints to set
     */
    public void setExcludedconnectpoints(String excludedconnectpoints) {
        this.excludedconnectpoints = excludedconnectpoints;
    }

    /**
     * @return the inboundflightstops
     */
    public Integer getInboundflightstops() {
        return inboundflightstops;
    }

    /**
     * @param inboundflightstops the inboundflightstops to set
     */
    public void setInboundflightstops(Integer inboundflightstops) {
        this.inboundflightstops = inboundflightstops;
    }

    /**
     * @return the outboundstopduration
     */
    public Integer getOutboundstopduration() {
        return outboundstopduration;
    }

    /**
     * @param outboundstopduration the outboundstopduration to set
     */
    public void setOutboundstopduration(Integer outboundstopduration) {
        this.outboundstopduration = outboundstopduration;
    }

    /**
     * @return the inboundstopduration
     */
    public Integer getInboundstopduration() {
        return inboundstopduration;
    }

    /**
     * @param inboundstopduration the inboundstopduration to set
     */
    public void setInboundstopduration(Integer inboundstopduration) {
        this.inboundstopduration = inboundstopduration;
    }

    /**
     * @return the outbounddeparturewindow
     */
    public String getOutbounddeparturewindow() {
        return outbounddeparturewindow;
    }

    /**
     * @param outbounddeparturewindow the outbounddeparturewindow to set
     */
    public void setOutbounddeparturewindow(String outbounddeparturewindow) {
        this.outbounddeparturewindow = outbounddeparturewindow;
    }

    /**
     * @return the inbounddeparturewindow
     */
    public String getInbounddeparturewindow() {
        return inbounddeparturewindow;
    }

    /**
     * @param inbounddeparturewindow the inbounddeparturewindow to set
     */
    public void setInbounddeparturewindow(String inbounddeparturewindow) {
        this.inbounddeparturewindow = inbounddeparturewindow;
    }

    /**
     * @return the outboundarrivalwindow
     */
    public String getOutboundarrivalwindow() {
        return outboundarrivalwindow;
    }

    /**
     * @param outboundarrivalwindow the outboundarrivalwindow to set
     */
    public void setOutboundarrivalwindow(String outboundarrivalwindow) {
        this.outboundarrivalwindow = outboundarrivalwindow;
    }

    /**
     * @return the inboundarrivalwindow
     */
    public String getInboundarrivalwindow() {
        return inboundarrivalwindow;
    }

    /**
     * @param inboundarrivalwindow the inboundarrivalwindow to set
     */
    public void setInboundarrivalwindow(String inboundarrivalwindow) {
        this.inboundarrivalwindow = inboundarrivalwindow;
    }

    /**
     * @return the onlineitinerariesonly
     */
    public String getOnlineitinerariesonly() {
        return onlineitinerariesonly;
    }

    /**
     * @param onlineitinerariesonly the onlineitinerariesonly to set
     */
    public void setOnlineitinerariesonly(String onlineitinerariesonly) {
        this.onlineitinerariesonly = onlineitinerariesonly;
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
     * @return the limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return the offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * @return the eticketsonly
     */
    public String getEticketsonly() {
        return eticketsonly;
    }

    /**
     * @param eticketsonly the eticketsonly to set
     */
    public void setEticketsonly(String eticketsonly) {
        this.eticketsonly = eticketsonly;
    }

    /**
     * @return the sortby
     */
    public String getSortby() {
        return sortby;
    }

    /**
     * @param sortby the sortby to set
     */
    public void setSortby(String sortby) {
        this.sortby = sortby;
    }

    /**
     * @return the order
     */
    public String getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * @return the sortby2
     */
    public String getSortby2() {
        return sortby2;
    }

    /**
     * @param sortby2 the sortby2 to set
     */
    public void setSortby2(String sortby2) {
        this.sortby2 = sortby2;
    }

    /**
     * @return the order2
     */
    public String getOrder2() {
        return order2;
    }

    /**
     * @param order2 the order2 to set
     */
    public void setOrder2(String order2) {
        this.order2 = order2;
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
        
}
