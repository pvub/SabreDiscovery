package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DepartureTimeZone {

    @SerializedName("GMTOffset")
    @Expose
    private Integer gMTOffset;

    public Integer getGMTOffset() {
    return gMTOffset;
    }

    public void setGMTOffset(Integer gMTOffset) {
    this.gMTOffset = gMTOffset;
    }

    public DepartureTimeZone withGMTOffset(Integer gMTOffset) {
    this.gMTOffset = gMTOffset;
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