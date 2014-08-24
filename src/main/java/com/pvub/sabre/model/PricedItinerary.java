
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PricedItinerary {

    @SerializedName("AirItinerary")
    @Expose
    private AirItinerary airItinerary;
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions_ tPAExtensions;
    @SerializedName("SequenceNumber")
    @Expose
    private Integer sequenceNumber;
    @SerializedName("AirItineraryPricingInfo")
    @Expose
    private AirItineraryPricingInfo_ airItineraryPricingInfo;
    @SerializedName("TicketingInfo")
    @Expose
    private TicketingInfo_ ticketingInfo;

    public void print(StringBuilder sb)
    {
        if (airItinerary != null)
        {
            airItinerary.print(sb);
        }
    }
    
    public AirItinerary getAirItinerary() {
        return airItinerary;
    }

    public void setAirItinerary(AirItinerary airItinerary) {
        this.airItinerary = airItinerary;
    }

    public PricedItinerary withAirItinerary(AirItinerary airItinerary) {
        this.airItinerary = airItinerary;
        return this;
    }

    public TPAExtensions_ getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions_ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public PricedItinerary withTPAExtensions(TPAExtensions_ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
        return this;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public PricedItinerary withSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    public AirItineraryPricingInfo_ getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    public void setAirItineraryPricingInfo(AirItineraryPricingInfo_ airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
    }

    public PricedItinerary withAirItineraryPricingInfo(AirItineraryPricingInfo_ airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
        return this;
    }

    public TicketingInfo_ getTicketingInfo() {
        return ticketingInfo;
    }

    public void setTicketingInfo(TicketingInfo_ ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }

    public PricedItinerary withTicketingInfo(TicketingInfo_ ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
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
