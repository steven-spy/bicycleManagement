package com.software.bicycle.dao.model;

/**
 * @author Steven
 * @create 2021/3/31 11:55
 */
public class BicycleModel {
    private int biId;
    private String biName;
    private String biPoint;
    private boolean biState;
    private boolean leaseState;
    private boolean biCycleMainTain;
    private String biJd;
    private String biWd;

    public int getBiId() {
        return biId;
    }

    public void setBiId(int biId) {
        this.biId = biId;
    }

    public String getBiName() {
        return biName;
    }

    public void setBiName(String biName) {
        this.biName = biName;
    }

    public boolean isBiState() {
        return biState;
    }

    public void setBiState(boolean biState) {
        this.biState = biState;
    }

    public boolean isLeaseState() {
        return leaseState;
    }

    public void setLeaseState(boolean leaseState) {
        this.leaseState = leaseState;
    }

    public String getBiPoint() {
        return biPoint;
    }

    public void setBiPoint(String biPoint) {
        this.biPoint = biPoint;
    }

    public boolean isBiCycleMainTain() {
        return biCycleMainTain;
    }

    public void setBiCycleMainTain(boolean biCycleMainTain) {
        this.biCycleMainTain = biCycleMainTain;
    }

    public String getBiJd() {
        return biJd;
    }

    public void setBiJd(String biJd) {
        this.biJd = biJd;
    }

    public String getBiWd() {
        return biWd;
    }

    public void setBiWd(String biWd) {
        this.biWd = biWd;
    }
}
