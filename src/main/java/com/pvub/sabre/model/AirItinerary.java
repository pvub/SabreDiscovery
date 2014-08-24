/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AirItinerary {

    @SerializedName("OriginDestinationOptions")
    @Expose
    private OriginDestinationOptions originDestinationOptions;
    @SerializedName("DirectionInd")
    @Expose
    private String directionInd;

    public void print(StringBuilder sb)
    {
        if (originDestinationOptions != null)
        {
            originDestinationOptions.print(sb);
        }
    }

    public OriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    public void setOriginDestinationOptions(OriginDestinationOptions originDestinationOptions) {
        this.originDestinationOptions = originDestinationOptions;
    }

    public AirItinerary withOriginDestinationOptions(OriginDestinationOptions originDestinationOptions) {
        this.originDestinationOptions = originDestinationOptions;
        return this;
    }

    public String getDirectionInd() {
        return directionInd;
    }

    public void setDirectionInd(String directionInd) {
        this.directionInd = directionInd;
    }

    public AirItinerary withDirectionInd(String directionInd) {
        this.directionInd = directionInd;
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
