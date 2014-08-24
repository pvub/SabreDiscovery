
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PassengerFare {

    @SerializedName("FareConstruction")
    @Expose
    private FareConstruction fareConstruction;
    @SerializedName("TotalFare")
    @Expose
    private TotalFare totalFare;
    @SerializedName("Taxes")
    @Expose
    private Taxes taxes;
    @SerializedName("BaseFare")
    @Expose
    private BaseFare baseFare;
    @SerializedName("EquivFare")
    @Expose
    private EquivFare equivFare;

    public FareConstruction getFareConstruction() {
        return fareConstruction;
    }

    public void setFareConstruction(FareConstruction fareConstruction) {
        this.fareConstruction = fareConstruction;
    }

    public PassengerFare withFareConstruction(FareConstruction fareConstruction) {
        this.fareConstruction = fareConstruction;
        return this;
    }

    public TotalFare getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(TotalFare totalFare) {
        this.totalFare = totalFare;
    }

    public PassengerFare withTotalFare(TotalFare totalFare) {
        this.totalFare = totalFare;
        return this;
    }

    public Taxes getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    public PassengerFare withTaxes(Taxes taxes) {
        this.taxes = taxes;
        return this;
    }

    public BaseFare getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(BaseFare baseFare) {
        this.baseFare = baseFare;
    }

    public PassengerFare withBaseFare(BaseFare baseFare) {
        this.baseFare = baseFare;
        return this;
    }

    public EquivFare getEquivFare() {
        return equivFare;
    }

    public void setEquivFare(EquivFare equivFare) {
        this.equivFare = equivFare;
    }

    public PassengerFare withEquivFare(EquivFare equivFare) {
        this.equivFare = equivFare;
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
