
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class FareInfo_ {

    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions____ tPAExtensions;
    @SerializedName("FareReference")
    @Expose
    private String fareReference;

    public TPAExtensions____ getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

    public FareInfo_ withTPAExtensions(TPAExtensions____ tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
        return this;
    }

    public String getFareReference() {
        return fareReference;
    }

    public void setFareReference(String fareReference) {
        this.fareReference = fareReference;
    }

    public FareInfo_ withFareReference(String fareReference) {
        this.fareReference = fareReference;
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
