
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ItinTotalFare_ {

    @SerializedName("FareConstruction")
    @Expose
    private FareConstruction___ fareConstruction;
    @SerializedName("TotalFare")
    @Expose
    private TotalFare___ totalFare;
    @SerializedName("Taxes")
    @Expose
    private Taxes___ taxes;
    @SerializedName("BaseFare")
    @Expose
    private BaseFare___ baseFare;
    @SerializedName("EquivFare")
    @Expose
    private EquivFare___ equivFare;

    public FareConstruction___ getFareConstruction() {
        return fareConstruction;
    }

    public void setFareConstruction(FareConstruction___ fareConstruction) {
        this.fareConstruction = fareConstruction;
    }

    public ItinTotalFare_ withFareConstruction(FareConstruction___ fareConstruction) {
        this.fareConstruction = fareConstruction;
        return this;
    }

    public TotalFare___ getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(TotalFare___ totalFare) {
        this.totalFare = totalFare;
    }

    public ItinTotalFare_ withTotalFare(TotalFare___ totalFare) {
        this.totalFare = totalFare;
        return this;
    }

    public Taxes___ getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes___ taxes) {
        this.taxes = taxes;
    }

    public ItinTotalFare_ withTaxes(Taxes___ taxes) {
        this.taxes = taxes;
        return this;
    }

    public BaseFare___ getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(BaseFare___ baseFare) {
        this.baseFare = baseFare;
    }

    public ItinTotalFare_ withBaseFare(BaseFare___ baseFare) {
        this.baseFare = baseFare;
        return this;
    }

    public EquivFare___ getEquivFare() {
        return equivFare;
    }

    public void setEquivFare(EquivFare___ equivFare) {
        this.equivFare = equivFare;
    }

    public ItinTotalFare_ withEquivFare(EquivFare___ equivFare) {
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
