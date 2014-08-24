
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PTCFareBreakdowns_ {

    @SerializedName("PTC_FareBreakdown")
    @Expose
    private PTCFareBreakdown_ pTCFareBreakdown;

    public PTCFareBreakdown_ getPTCFareBreakdown() {
        return pTCFareBreakdown;
    }

    public void setPTCFareBreakdown(PTCFareBreakdown_ pTCFareBreakdown) {
        this.pTCFareBreakdown = pTCFareBreakdown;
    }

    public PTCFareBreakdowns_ withPTCFareBreakdown(PTCFareBreakdown_ pTCFareBreakdown) {
        this.pTCFareBreakdown = pTCFareBreakdown;
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
