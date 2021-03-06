package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class MarketingAirline {

    @SerializedName("Code")
    @Expose
    private String code;

    public String getCode() {
    return code;
    }

    public void setCode(String code) {
    this.code = code;
    }

    public MarketingAirline withCode(String code) {
    this.code = code;
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