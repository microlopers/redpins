package com.microlopers.redpins.carlogs.persistence.entity;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="carlog")
public class CarLog  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "carLicenceId")
    private String carLicenceId;

    @Column(name= "startDestination")
    private String startDestination;

    @Column(name= "endDestination")
    private String endDestination;

    @Column(name= "startDateTime")
    private LocalDate startDateTime;

    @Column(name= "endTime")
    private LocalDate endTime;

    @Column(name= "description")
    private String description;

    @Column(name= "counterEndState")
    private int counterEndState;

    @Column(name= "businessDistance")
    private BigDecimal businessDistance;

    @Column(name= "personalDistance")
    private BigDecimal personalDistance;

    @Column(name= "boughtFuelValue")
    private BigDecimal boughtFuelValue;

    @Column(name= "boughtFuelAmount")
    private BigDecimal boughtFuelAmount;

    @Column(name= "driverID")
    private int driverID;

    @Column(name= "maximalSpeed")
    private BigDecimal maximalSpeed;

    @Column(name= "averageSpeed")
    private BigDecimal averageSpeed;

    public CarLog() {
        super();
    }

    public CarLog(long id,String carLicenceId, String startDestination, String endDestination, LocalDate startDateTime, LocalDate endTime, String description, int counterEndState, BigDecimal businessDistance, BigDecimal personalDistance, BigDecimal boughtFuelValue, BigDecimal boughtFuelAmount, int driverID, BigDecimal maximalSpeed, BigDecimal averageSpeed) {
        this.id = id;
        this.carLicenceId = carLicenceId;
        this.startDestination = startDestination;
        this.endDestination = endDestination;
        this.startDateTime = startDateTime;
        this.endTime = endTime;
        this.description = description;
        this.counterEndState = counterEndState;
        this.businessDistance = businessDistance;
        this.personalDistance = personalDistance;
        this.boughtFuelValue = boughtFuelValue;
        this.boughtFuelAmount = boughtFuelAmount;
        this.driverID = driverID;
        this.maximalSpeed = maximalSpeed;
        this.averageSpeed = averageSpeed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStartDestination() {
        return startDestination;
    }

    public void setStartDestination(String startDestination) {
        this.startDestination = startDestination;
    }

    public String getEndDestination() {
        return endDestination;
    }

    public void setEndDestination(String endDestination) {
        this.endDestination = endDestination;
    }

    public LocalDate getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDate startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCounterEndState() {
        return counterEndState;
    }

    public void setCounterEndState(int counterEndState) {
        this.counterEndState = counterEndState;
    }

    public BigDecimal getBusinessDistance() {
        return businessDistance;
    }

    public void setBusinessDistance(BigDecimal businessDistance) {
        this.businessDistance = businessDistance;
    }

    public BigDecimal getPersonalDistance() {
        return personalDistance;
    }

    public void setPersonalDistance(BigDecimal personalDistance) {
        this.personalDistance = personalDistance;
    }

    public BigDecimal getBoughtFuelValue() {
        return boughtFuelValue;
    }

    public void setBoughtFuelValue(BigDecimal boughtFuelValue) {
        this.boughtFuelValue = boughtFuelValue;
    }

    public BigDecimal getBoughtFuelAmount() {
        return boughtFuelAmount;
    }

    public void setBoughtFuelAmount(BigDecimal boughtFuelAmount) {
        this.boughtFuelAmount = boughtFuelAmount;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public BigDecimal getMaximalSpeed() {
        return maximalSpeed;
    }

    public void setMaximalSpeed(BigDecimal maximalSpeed) {
        this.maximalSpeed = maximalSpeed;
    }

    public BigDecimal getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(BigDecimal averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getCarLicenceId() {
        return carLicenceId;
    }

    public void setCarLicenceId(String carLicenceId) {
        this.carLicenceId = carLicenceId;
    }
}
