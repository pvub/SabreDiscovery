
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AirItineraryPricingInfo_ {

    @SerializedName("PTC_FareBreakdowns")
    @Expose
    private PTCFareBreakdowns_ pTCFareBreakdowns;
    @SerializedName("FareInfos")
    @Expose
    private FareInfos_ fareInfos;
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions_____ tPAExtensions;
    @SerializedName("ItinTotalFare")
    @Expose
    private ItinTotalFare_ itinTotalFare;

    public PTCFareBreakdowns_ getPTCFareBreakdowns() {
        return pTCFareBreakdowns;
    }

    public void setPTCFareBreakdowns(PTCFareBreakdowns_ pTCFareBreakdowns) {
        this.pTCFareBreakdowns = pTCFareBreakdowns;
    }

    public AirItineraryPricingInfo_ withPTCFareBreakdowns(PTCFareBreakdowns_ pTCFareBreakdowns) {
        this.pTCFareBreakdowns = pTCFareBreakdowns;
        return this;
    }

    public FareInfos_ getFareInfos() {
        return fareInfos;
    }

    public void setFareInfos(FareInfos_ fareInfos) {
        this.fareInfos = fareInfos;
    }

    public AirItineraryPricingInfo_ withFareInfos(FareInfos_ fareInfos) {
        this.fareInfos = fareInfos;
        return this;
    }

    public TPAExtensions_____ getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions_____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public AirItineraryPricingInfo_ withTPAExtensions(TPAExtensions_____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
        return this;
    }

    public ItinTotalFare_ getItinTotalFare() {
        return itinTotalFare;
    }

    public void setItinTotalFare(ItinTotalFare_ itinTotalFare) {
        this.itinTotalFare = itinTotalFare;
    }

    public AirItineraryPricingInfo_ withItinTotalFare(ItinTotalFare_ itinTotalFare) {
        this.itinTotalFare = itinTotalFare;
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
