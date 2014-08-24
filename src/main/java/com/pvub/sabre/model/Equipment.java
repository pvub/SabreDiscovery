package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Equipment {

    @SerializedName("AirEquipType")
    @Expose
    private String airEquipType;

    public String getAirEquipType() {
    return airEquipType;
    }

    public void setAirEquipType(String airEquipType) {
    this.airEquipType = airEquipType;
    }

    public Equipment withAirEquipType(String airEquipType) {
    this.airEquipType = airEquipType;
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