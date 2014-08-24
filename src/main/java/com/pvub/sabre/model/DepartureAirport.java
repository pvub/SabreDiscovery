package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DepartureAirport {

    @SerializedName("LocationCode")
    @Expose
    private String locationCode;

    public void print(StringBuilder sb)
    {
        sb.append(locationCode);
    }

    public String getLocationCode() {
    return locationCode;
    }

    public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
    }

    public DepartureAirport withLocationCode(String locationCode) {
    this.locationCode = locationCode;
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
