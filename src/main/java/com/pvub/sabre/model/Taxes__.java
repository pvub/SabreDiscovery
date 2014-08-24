
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
public class Taxes__ {

    @SerializedName("TotalTax")
    @Expose
    private TotalTax_ totalTax;
    @SerializedName("Tax")
    @Expose
    private List<Tax__> tax = new ArrayList<Tax__>();

    public TotalTax_ getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(TotalTax_ totalTax) {
        this.totalTax = totalTax;
    }

    public Taxes__ withTotalTax(TotalTax_ totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    public List<Tax__> getTax() {
        return tax;
    }

    public void setTax(List<Tax__> tax) {
        this.tax = tax;
    }

    public Taxes__ withTax(List<Tax__> tax) {
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
