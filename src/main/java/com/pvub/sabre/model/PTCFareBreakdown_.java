
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PTCFareBreakdown_ {

    @SerializedName("FareBasisCodes")
    @Expose
    private FareBasisCodes_ fareBasisCodes;
    @SerializedName("PassengerTypeQuantity")
    @Expose
    private PassengerTypeQuantity_ passengerTypeQuantity;
    @SerializedName("PassengerFare")
    @Expose
    private PassengerFare_ passengerFare;

    public FareBasisCodes_ getFareBasisCodes() {
        return fareBasisCodes;
    }

    public void setFareBasisCodes(FareBasisCodes_ fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
    }

    public PTCFareBreakdown_ withFareBasisCodes(FareBasisCodes_ fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
        return this;
    }

    public PassengerTypeQuantity_ getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    public void setPassengerTypeQuantity(PassengerTypeQuantity_ passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    public PTCFareBreakdown_ withPassengerTypeQuantity(PassengerTypeQuantity_ passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
        return this;
    }

    public PassengerFare_ getPassengerFare() {
        return passengerFare;
    }

    public void setPassengerFare(PassengerFare_ passengerFare) {
        this.passengerFare = passengerFare;
    }

    public PTCFareBreakdown_ withPassengerFare(PassengerFare_ passengerFare) {
        this.passengerFare = passengerFare;
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
