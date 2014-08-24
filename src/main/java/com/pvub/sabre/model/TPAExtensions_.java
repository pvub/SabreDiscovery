
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
public class TPAExtensions_ {

    @SerializedName("ValidatingCarrier")
    @Expose
    private ValidatingCarrier validatingCarrier;
    @SerializedName("AdditionalFares")
    @Expose
    private List<AdditionalFare> additionalFares = new ArrayList<AdditionalFare>();

    public ValidatingCarrier getValidatingCarrier() {
        return validatingCarrier;
    }

    public void setValidatingCarrier(ValidatingCarrier validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    public TPAExtensions_ withValidatingCarrier(ValidatingCarrier validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
        return this;
    }

    public List<AdditionalFare> getAdditionalFares() {
        return additionalFares;
    }

    public void setAdditionalFares(List<AdditionalFare> additionalFares) {
        this.additionalFares = additionalFares;
    }

    public TPAExtensions_ withAdditionalFares(List<AdditionalFare> additionalFares) {
        this.additionalFares = additionalFares;
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
