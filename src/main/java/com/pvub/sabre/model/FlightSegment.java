package com.pvub.sabre.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class FlightSegment {

    @SerializedName("DepartureAirport")
    @Expose
    private DepartureAirport departureAirport;
    @SerializedName("ArrivalAirport")
    @Expose
    private ArrivalAirport arrivalAirport;
    @SerializedName("MarketingAirline")
    @Expose
    private MarketingAirline marketingAirline;
    @SerializedName("ArrivalTimeZone")
    @Expose
    private ArrivalTimeZone arrivalTimeZone;
    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions tPAExtensions;
    @SerializedName("StopQuantity")
    @Expose
    private Integer stopQuantity;
    @SerializedName("ElapsedTime")
    @Expose
    private Integer elapsedTime;
    @SerializedName("ResBookDesigCode")
    @Expose
    private String resBookDesigCode;
    @SerializedName("MarriageGrp")
    @Expose
    private String marriageGrp;
    @SerializedName("Equipment")
    @Expose
    private Equipment equipment;
    @SerializedName("DepartureDateTime")
    @Expose
    private String departureDateTime;
    @SerializedName("ArrivalDateTime")
    @Expose
    private String arrivalDateTime;
    @SerializedName("FlightNumber")
    @Expose
    private Integer flightNumber;
    @SerializedName("OperatingAirline")
    @Expose
    private OperatingAirline operatingAirline;
    @SerializedName("DepartureTimeZone")
    @Expose
    private DepartureTimeZone departureTimeZone;

    public void print(StringBuilder sb)
    {
        departureAirport.print(sb);
        sb.append(" -> ");
        arrivalAirport.print(sb);
        sb.append(" ");
        operatingAirline.print(sb);
        sb.append("\n");
    }

    public DepartureAirport getDepartureAirport() {
    return departureAirport;
    }

    public void setDepartureAirport(DepartureAirport departureAirport) {
    this.departureAirport = departureAirport;
    }

    public FlightSegment withDepartureAirport(DepartureAirport departureAirport) {
    this.departureAirport = departureAirport;
    return this;
    }

    public ArrivalAirport getArrivalAirport() {
    return arrivalAirport;
    }

    public void setArrivalAirport(ArrivalAirport arrivalAirport) {
    this.arrivalAirport = arrivalAirport;
    }

    public FlightSegment withArrivalAirport(ArrivalAirport arrivalAirport) {
    this.arrivalAirport = arrivalAirport;
    return this;
    }

    public MarketingAirline getMarketingAirline() {
    return marketingAirline;
    }

    public void setMarketingAirline(MarketingAirline marketingAirline) {
    this.marketingAirline = marketingAirline;
    }

    public FlightSegment withMarketingAirline(MarketingAirline marketingAirline) {
    this.marketingAirline = marketingAirline;
    return this;
    }

    public ArrivalTimeZone getArrivalTimeZone() {
    return arrivalTimeZone;
    }

    public void setArrivalTimeZone(ArrivalTimeZone arrivalTimeZone) {
    this.arrivalTimeZone = arrivalTimeZone;
    }

    public FlightSegment withArrivalTimeZone(ArrivalTimeZone arrivalTimeZone) {
    this.arrivalTimeZone = arrivalTimeZone;
    return this;
    }

    public TPAExtensions getTPAExtensions() {
    return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions tPAExtensions) {
    this.tPAExtensions = tPAExtensions;
    }

    public FlightSegment withTPAExtensions(TPAExtensions tPAExtensions) {
    this.tPAExtensions = tPAExtensions;
    return this;
    }

    public Integer getStopQuantity() {
    return stopQuantity;
    }

    public void setStopQuantity(Integer stopQuantity) {
    this.stopQuantity = stopQuantity;
    }

    public FlightSegment withStopQuantity(Integer stopQuantity) {
    this.stopQuantity = stopQuantity;
    return this;
    }

    public Integer getElapsedTime() {
    return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    }

    public FlightSegment withElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
    }

    public String getResBookDesigCode() {
    return resBookDesigCode;
    }

    public void setResBookDesigCode(String resBookDesigCode) {
    this.resBookDesigCode = resBookDesigCode;
    }

    public FlightSegment withResBookDesigCode(String resBookDesigCode) {
    this.resBookDesigCode = resBookDesigCode;
    return this;
    }

    public String getMarriageGrp() {
    return marriageGrp;
    }

    public void setMarriageGrp(String marriageGrp) {
    this.marriageGrp = marriageGrp;
    }

    public FlightSegment withMarriageGrp(String marriageGrp) {
    this.marriageGrp = marriageGrp;
    return this;
    }

    public Equipment getEquipment() {
    return equipment;
    }

    public void setEquipment(Equipment equipment) {
    this.equipment = equipment;
    }

    public FlightSegment withEquipment(Equipment equipment) {
    this.equipment = equipment;
    return this;
    }

    public String getDepartureDateTime() {
    return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
    }

    public FlightSegment withDepartureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
    return this;
    }

    public String getArrivalDateTime() {
    return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
    }

    public FlightSegment withArrivalDateTime(String arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
    return this;
    }

    public Integer getFlightNumber() {
    return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
    this.flightNumber = flightNumber;
    }

    public FlightSegment withFlightNumber(Integer flightNumber) {
    this.flightNumber = flightNumber;
    return this;
    }

    public OperatingAirline getOperatingAirline() {
    return operatingAirline;
    }

    public void setOperatingAirline(OperatingAirline operatingAirline) {
    this.operatingAirline = operatingAirline;
    }

    public FlightSegment withOperatingAirline(OperatingAirline operatingAirline) {
    this.operatingAirline = operatingAirline;
    return this;
    }

    public DepartureTimeZone getDepartureTimeZone() {
    return departureTimeZone;
    }

    public void setDepartureTimeZone(DepartureTimeZone departureTimeZone) {
    this.departureTimeZone = departureTimeZone;
    }

    public FlightSegment withDepartureTimeZone(DepartureTimeZone departureTimeZone) {
    this.departureTimeZone = departureTimeZone;
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