
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
public class OriginDestinationOption {

    @SerializedName("FlightSegment")
    @Expose
    private List<FlightSegment> flightSegment = new ArrayList<FlightSegment>();
    @SerializedName("ElapsedTime")
    @Expose
    private Integer elapsedTime;

    public void print(StringBuilder sb)
    {
        if (flightSegment != null)
        {
            for (FlightSegment fs : flightSegment)
            {
                fs.print(sb);
            }
        }
    }

    public List<FlightSegment> getFlightSegment() {
        return flightSegment;
    }

    public void setFlightSegment(List<FlightSegment> flightSegment) {
        this.flightSegment = flightSegment;
    }

    public OriginDestinationOption withFlightSegment(List<FlightSegment> flightSegment) {
        this.flightSegment = flightSegment;
        return this;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public OriginDestinationOption withElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
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
