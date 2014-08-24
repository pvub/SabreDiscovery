
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
public class OriginDestinationOptions {

    @SerializedName("OriginDestinationOption")
    @Expose
    private List<OriginDestinationOption> originDestinationOption = new ArrayList<OriginDestinationOption>();

    public void print(StringBuilder sb)
    {
        if (originDestinationOption != null)
        {
            for (OriginDestinationOption odo : originDestinationOption)
            {
                odo.print(sb);
            }
        }
    }
    
    public List<OriginDestinationOption> getOriginDestinationOption() {
        return originDestinationOption;
    }

    public void setOriginDestinationOption(List<OriginDestinationOption> originDestinationOption) {
        this.originDestinationOption = originDestinationOption;
    }

    public OriginDestinationOptions withOriginDestinationOption(List<OriginDestinationOption> originDestinationOption) {
        this.originDestinationOption = originDestinationOption;
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
