/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AirItineraryPricingInfo {

    @SerializedName("PTC_FareBreakdowns")
    @Expose
    private PTCFareBreakdowns pTCFareBreakdowns;
    @SerializedName("FareInfos")
    @Expose
    private FareInfos fareInfos;
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions___ tPAExtensions;
    @SerializedName("PricingSubSource")
    @Expose
    private String pricingSubSource;
    @SerializedName("ItinTotalFare")
    @Expose
    private ItinTotalFare itinTotalFare;
    @SerializedName("PricingSource")
    @Expose
    private String pricingSource;

    public PTCFareBreakdowns getPTCFareBreakdowns() {
        return pTCFareBreakdowns;
    }

    public void setPTCFareBreakdowns(PTCFareBreakdowns pTCFareBreakdowns) {
        this.pTCFareBreakdowns = pTCFareBreakdowns;
    }

    public AirItineraryPricingInfo withPTCFareBreakdowns(PTCFareBreakdowns pTCFareBreakdowns) {
        this.pTCFareBreakdowns = pTCFareBreakdowns;
        return this;
    }

    public FareInfos getFareInfos() {
        return fareInfos;
    }

    public void setFareInfos(FareInfos fareInfos) {
        this.fareInfos = fareInfos;
    }

    public AirItineraryPricingInfo withFareInfos(FareInfos fareInfos) {
        this.fareInfos = fareInfos;
        return this;
    }

    public TPAExtensions___ getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions___ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public AirItineraryPricingInfo withTPAExtensions(TPAExtensions___ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
        return this;
    }

    public String getPricingSubSource() {
        return pricingSubSource;
    }

    public void setPricingSubSource(String pricingSubSource) {
        this.pricingSubSource = pricingSubSource;
    }

    public AirItineraryPricingInfo withPricingSubSource(String pricingSubSource) {
        this.pricingSubSource = pricingSubSource;
        return this;
    }

    public ItinTotalFare getItinTotalFare() {
        return itinTotalFare;
    }

    public void setItinTotalFare(ItinTotalFare itinTotalFare) {
        this.itinTotalFare = itinTotalFare;
    }

    public AirItineraryPricingInfo withItinTotalFare(ItinTotalFare itinTotalFare) {
        this.itinTotalFare = itinTotalFare;
        return this;
    }

    public String getPricingSource() {
        return pricingSource;
    }

    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
    }

    public AirItineraryPricingInfo withPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
        return this;
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
