package com.software.bicycle.dao.model;

public class BicycleModel {
    private int bicycleId;
    private String bicycleName;
    private boolean bicycleState;
    private boolean leaseState;
    private String bicyclePoint;
    private boolean bicycleMainTain;

    public boolean isBicycleMainTain() {
        return bicycleMainTain;
    }

    public void setBicycleMainTain(boolean bicycleMainTain) {
        this.bicycleMainTain = bicycleMainTain;
    }

    public boolean isLeaseState() {
        return leaseState;
    }

    public void setLeaseState(boolean leaseState) {
        this.leaseState = leaseState;
    }

    public String getBicyclePoint() {
        return bicyclePoint;
    }

    public void setBicyclePoint(String bicyclePoint) {
        this.bicyclePoint = bicyclePoint;
    }

    public int getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(int bicycleId) {
        this.bicycleId = bicycleId;
    }

    public String getBicycleName() {
        return bicycleName;
    }

    public void setBicycleName(String bicycleName) {
        this.bicycleName = bicycleName;
    }

    public boolean isBicycleState() {
        return bicycleState;
    }

    public void setBicycleState(boolean bicycleState) {
        this.bicycleState = bicycleState;
    }
}
