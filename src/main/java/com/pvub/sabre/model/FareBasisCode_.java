
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class FareBasisCode_ {

    @SerializedName("BookingCode")
    @Expose
    private String bookingCode;
    @SerializedName("DepartureAirportCode")
    @Expose
    private String departureAirportCode;
    @SerializedName("ArrivalAirportCode")
    @Expose
    private String arrivalAirportCode;
    @Expose
    private String content;
    @SerializedName("AvailabilityBreak")
    @Expose
    private Boolean availabilityBreak;

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public FareBasisCode_ withBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
        return this;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public FareBasisCode_ withDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
        return this;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    public FareBasisCode_ withArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
        return this;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public FareBasisCode_ withContent(String content) {
        this.content = content;
        return this;
    }

    public Boolean getAvailabilityBreak() {
        return availabilityBreak;
    }

    public void setAvailabilityBreak(Boolean availabilityBreak) {
        this.availabilityBreak = availabilityBreak;
    }

    public FareBasisCode_ withAvailabilityBreak(Boolean availabilityBreak) {
        this.availabilityBreak = availabilityBreak;
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
