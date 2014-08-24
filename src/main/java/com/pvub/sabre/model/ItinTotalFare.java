
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ItinTotalFare {

    @SerializedName("FareConstruction")
    @Expose
    private FareConstruction_ fareConstruction;
    @SerializedName("TotalFare")
    @Expose
    private TotalFare_ totalFare;
    @SerializedName("Taxes")
    @Expose
    private Taxes_ taxes;
    @SerializedName("BaseFare")
    @Expose
    private BaseFare_ baseFare;
    @SerializedName("EquivFare")
    @Expose
    private EquivFare_ equivFare;

    public FareConstruction_ getFareConstruction() {
        return fareConstruction;
    }

    public void setFareConstruction(FareConstruction_ fareConstruction) {
        this.fareConstruction = fareConstruction;
    }

    public ItinTotalFare withFareConstruction(FareConstruction_ fareConstruction) {
        this.fareConstruction = fareConstruction;
        return this;
    }

    public TotalFare_ getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(TotalFare_ totalFare) {
        this.totalFare = totalFare;
    }

    public ItinTotalFare withTotalFare(TotalFare_ totalFare) {
        this.totalFare = totalFare;
        return this;
    }

    public Taxes_ getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes_ taxes) {
        this.taxes = taxes;
    }

    public ItinTotalFare withTaxes(Taxes_ taxes) {
        this.taxes = taxes;
        return this;
    }

    public BaseFare_ getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(BaseFare_ baseFare) {
        this.baseFare = baseFare;
    }

    public ItinTotalFare withBaseFare(BaseFare_ baseFare) {
        this.baseFare = baseFare;
        return this;
    }

    public EquivFare_ getEquivFare() {
        return equivFare;
    }

    public void setEquivFare(EquivFare_ equivFare) {
        this.equivFare = equivFare;
    }

    public ItinTotalFare withEquivFare(EquivFare_ equivFare) {
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
