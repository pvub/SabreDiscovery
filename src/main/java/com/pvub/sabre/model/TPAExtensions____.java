
package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class TPAExtensions____ {

    @SerializedName("Cabin")
    @Expose
    private Cabin_ cabin;

    public Cabin_ getCabin() {
        return cabin;
    }

    public void setCabin(Cabin_ cabin) {
        this.cabin = cabin;
    }

    public TPAExtensions____ withCabin(Cabin_ cabin) {
        this.cabin = cabin;
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
