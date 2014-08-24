
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
public class Taxes_ {

    @SerializedName("Tax")
    @Expose
    private List<Tax_> tax = new ArrayList<Tax_>();

    public List<Tax_> getTax() {
        return tax;
    }

    public void setTax(List<Tax_> tax) {
        this.tax = tax;
    }

    public Taxes_ withTax(List<Tax_> tax) {
        this.tax = tax;
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
