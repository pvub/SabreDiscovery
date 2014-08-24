
package com.pvub.sabre.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class InstaFlightItenaries {

    @SerializedName("PricedItineraries")
    @Expose
    private List<PricedItinerary> pricedItineraries = new ArrayList<PricedItinerary>();
    @SerializedName("ReturnDateTime")
    @Expose
    private String returnDateTime;
    @SerializedName("DepartureDateTime")
    @Expose
    private String departureDateTime;
    @SerializedName("DestinationLocation")
    @Expose
    private String destinationLocation;
    @SerializedName("OriginLocation")
    @Expose
    private String originLocation;
    @SerializedName("Links")
    @Expose
    private List<Link> links = new ArrayList<Link>();
    
    public void print(StringBuilder sb)
    {
        for (PricedItinerary i : pricedItineraries)
        {
            sb.append("Itinerary: ");
            i.print(sb);
            sb.append("\n");
        }
    }

    public List<PricedItinerary> getPricedItineraries() {
        return pricedItineraries;
    }

    public void setPricedItineraries(List<PricedItinerary> pricedItineraries) {
        this.pricedItineraries = pricedItineraries;
    }

    public InstaFlightItenaries withPricedItineraries(List<PricedItinerary> pricedItineraries) {
        this.pricedItineraries = pricedItineraries;
        return this;
    }

    public String getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public InstaFlightItenaries withReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
        return this;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public InstaFlightItenaries withDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
        return this;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public InstaFlightItenaries withDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
        return this;
    }

    public String getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(String originLocation) {
        this.originLocation = originLocation;
    }

    public InstaFlightItenaries withOriginLocation(String originLocation) {
        this.originLocation = originLocation;
        return this;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public InstaFlightItenaries withLinks(List<Link> links) {
        this.links = links;
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
