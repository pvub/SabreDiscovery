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
public class LeadPriceCalendar 
{

    @SerializedName("OriginLocation")
    @Expose
    private String originLocation;
    @SerializedName("DestinationLocation")
    @Expose
    private String destinationLocation;
    @SerializedName("FareInfo")
    @Expose
    private List<FareInfo> fareInfo = new ArrayList<FareInfo>();

    public String getOriginLocation() {
    return originLocation;
    }

    public void setOriginLocation(String originLocation) {
    this.originLocation = originLocation;
    }

    public String getDestinationLocation() {
    return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
    this.destinationLocation = destinationLocation;
    }

    public List<FareInfo> getFareInfo() {
    return fareInfo;
    }

    public void setFareInfo(List<FareInfo> fareInfo) {
    this.fareInfo = fareInfo;
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