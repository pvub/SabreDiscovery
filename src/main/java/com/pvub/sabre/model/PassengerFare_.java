
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PassengerFare_ {

    @SerializedName("FareConstruction")
    @Expose
    private FareConstruction__ fareConstruction;
    @SerializedName("TotalFare")
    @Expose
    private TotalFare__ totalFare;
    @SerializedName("Taxes")
    @Expose
    private Taxes__ taxes;
    @SerializedName("BaseFare")
    @Expose
    private BaseFare__ baseFare;
    @SerializedName("EquivFare")
    @Expose
    private EquivFare__ equivFare;

    public FareConstruction__ getFareConstruction() {
        return fareConstruction;
    }

    public void setFareConstruction(FareConstruction__ fareConstruction) {
        this.fareConstruction = fareConstruction;
    }

    public PassengerFare_ withFareConstruction(FareConstruction__ fareConstruction) {
        this.fareConstruction = fareConstruction;
        return this;
    }

    public TotalFare__ getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(TotalFare__ totalFare) {
        this.totalFare = totalFare;
    }

    public PassengerFare_ withTotalFare(TotalFare__ totalFare) {
        this.totalFare = totalFare;
        return this;
    }

    public Taxes__ getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes__ taxes) {
        this.taxes = taxes;
    }

    public PassengerFare_ withTaxes(Taxes__ taxes) {
        this.taxes = taxes;
        return this;
    }

    public BaseFare__ getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(BaseFare__ baseFare) {
        this.baseFare = baseFare;
    }

    public PassengerFare_ withBaseFare(BaseFare__ baseFare) {
        this.baseFare = baseFare;
        return this;
    }

    public EquivFare__ getEquivFare() {
        return equivFare;
    }

    public void setEquivFare(EquivFare__ equivFare) {
        this.equivFare = equivFare;
    }

    public PassengerFare_ withEquivFare(EquivFare__ equivFare) {
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
