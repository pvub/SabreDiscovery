/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.df.model;

/**
 *
 * @author Udai Bhaskar <udaibhaskar.com>
 */

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Link {

    @Expose
    private String rel;
    @Expose
    private String href;

    public String getRel() {
    return rel;
    }

    public void setRel(String rel) {
    this.rel = rel;
    }

    public String getHref() {
    return href;
    }

    public void setHref(String href) {
    this.href = href;
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