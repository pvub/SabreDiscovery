/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.lpc.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */
@Generated("org.jsonschema2pojo")
public class FareInfo 
{

    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("LowestNonStopFare")
    @Expose
    private Double lowestNonStopFare;
    @SerializedName("LowestFare")
    @Expose
    private Double lowestFare;
    @SerializedName("DepartureDateTime")
    @Expose
    private String departureDateTime;
    @SerializedName("ReturnDateTime")
    @Expose
    private String returnDateTime;
    @SerializedName("Links")
    @Expose
    private List<Link> links = new ArrayList<Link>();

    public String getCurrencyCode() {
    return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    }

    public Double getLowestNonStopFare() {
    return lowestNonStopFare;
    }

    public void setLowestNonStopFare(Double lowestNonStopFare) {
    this.lowestNonStopFare = lowestNonStopFare;
    }

    public Double getLowestFare() {
    return lowestFare;
    }

    public void setLowestFare(Double lowestFare) {
    this.lowestFare = lowestFare;
    }

    public String getDepartureDateTime() {
    return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
    }

    public String getReturnDateTime() {
    return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
    this.returnDateTime = returnDateTime;
    }

    public List<Link> getLinks() {
    return links;
    }

    public void setLinks(List<Link> links) {
    this.links = links;
    }

    @Override
    public String toString() {
    return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
    return EqualsBuilder.reflectionEquals(this, other);
    }

}