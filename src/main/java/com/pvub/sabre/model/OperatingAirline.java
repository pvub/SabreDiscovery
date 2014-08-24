/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.model;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class OperatingAirline {

    @SerializedName("FlightNumber")
    @Expose
    private Integer flightNumber;
    @SerializedName("Code")
    @Expose
    private String code;

    public void print(StringBuilder sb)
    {
        sb.append(code).append(flightNumber);
    }

    public Integer getFlightNumber() {
    return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
    this.flightNumber = flightNumber;
    }

    public OperatingAirline withFlightNumber(Integer flightNumber) {
    this.flightNumber = flightNumber;
    return this;
    }

    public String getCode() {
    return code;
    }

    public void setCode(String code) {
    this.code = code;
    }

    public OperatingAirline withCode(String code) {
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