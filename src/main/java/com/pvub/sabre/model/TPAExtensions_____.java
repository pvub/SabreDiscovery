
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class TPAExtensions_____ {

    @SerializedName("DivideInParty")
    @Expose
    private DivideInParty_ divideInParty;

    public DivideInParty_ getDivideInParty() {
        return divideInParty;
    }

    public void setDivideInParty(DivideInParty_ divideInParty) {
        this.divideInParty = divideInParty;
    }

    public TPAExtensions_____ withDivideInParty(DivideInParty_ divideInParty) {
        this.divideInParty = divideInParty;
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
