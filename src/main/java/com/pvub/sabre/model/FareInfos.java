
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
public class FareInfos {

    @SerializedName("FareInfo")
    @Expose
    private List<FareInfo> fareInfo = new ArrayList<FareInfo>();

    public List<FareInfo> getFareInfo() {
        return fareInfo;
    }

    public void setFareInfo(List<FareInfo> fareInfo) {
        this.fareInfo = fareInfo;
    }

    public FareInfos withFareInfo(List<FareInfo> fareInfo) {
        this.fareInfo = fareInfo;
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
