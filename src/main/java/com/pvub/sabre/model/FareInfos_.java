
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
public class FareInfos_ {

    @SerializedName("FareInfo")
    @Expose
    private List<FareInfo_> fareInfo = new ArrayList<FareInfo_>();

    public List<FareInfo_> getFareInfo() {
        return fareInfo;
    }

    public void setFareInfo(List<FareInfo_> fareInfo) {
        this.fareInfo = fareInfo;
    }

    public FareInfos_ withFareInfo(List<FareInfo_> fareInfo) {
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
