/*
 * Udai Bhaskar
 * Copyright 2014
 * udaibhaskar.com
 * pvub@yahoo.com
 */

package com.pvub.sabre.model;

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
public class TPAExtensions {

    @Expose
    private ETicket eTicket;

    public ETicket getETicket() {
    return eTicket;
    }

    public void setETicket(ETicket eTicket) {
    this.eTicket = eTicket;
    }

    public TPAExtensions withETicket(ETicket eTicket) {
    this.eTicket = eTicket;
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