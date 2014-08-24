
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PTCFareBreakdown {

    @SerializedName("FareBasisCodes")
    @Expose
    private FareBasisCodes fareBasisCodes;
    @SerializedName("PassengerTypeQuantity")
    @Expose
    private PassengerTypeQuantity passengerTypeQuantity;
    @SerializedName("PassengerFare")
    @Expose
    private PassengerFare passengerFare;

    public FareBasisCodes getFareBasisCodes() {
        return fareBasisCodes;
    }

    public void setFareBasisCodes(FareBasisCodes fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
    }

    public PTCFareBreakdown withFareBasisCodes(FareBasisCodes fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
        return this;
    }

    public PassengerTypeQuantity getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    public void setPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

    public PTCFareBreakdown withPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
        return this;
    }

    public PassengerFare getPassengerFare() {
        return passengerFare;
    }

    public void setPassengerFare(PassengerFare passengerFare) {
        this.passengerFare = passengerFare;
    }

    public PTCFareBreakdown withPassengerFare(PassengerFare passengerFare) {
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
