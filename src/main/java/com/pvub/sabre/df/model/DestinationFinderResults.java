/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.df.model;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DestinationFinderResults {

    @SerializedName("OriginLocation")
    @Expose
    private String originLocation;
    @SerializedName("FareInfo")
    @Expose
    private List<FareInfo> fareInfo = new ArrayList<FareInfo>();
    @SerializedName("Links")
    @Expose
    private List<Link_> links = new ArrayList<Link_>();

    public String getOriginLocation() {
    return originLocation;
    }

    public void setOriginLocation(String originLocation) {
    this.originLocation = originLocation;
    }

    public List<FareInfo> getFareInfo() {
    return fareInfo;
    }

    public void setFareInfo(List<FareInfo> fareInfo) {
    this.fareInfo = fareInfo;
    }

    public List<Link_> getLinks() {
    return links;
    }

    public void setLinks(List<Link_> links) {
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