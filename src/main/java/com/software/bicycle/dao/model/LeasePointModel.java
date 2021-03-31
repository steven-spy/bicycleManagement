package com.software.bicycle.dao.model;


/**
 * 租赁点实体类
 *
 * @author spy
 */
public class LeasePointModel {
    private Long lpId;
    private String lpName;
    private String lpJd;
    private String lpWd;
    private Long lpBiNumber;
    private Long lpLeaser;

    public Long getLpId() {
        return lpId;
    }

    public void setLpId(Long lpId) {
        this.lpId = lpId;
    }

    public String getLpName() {
        return lpName;
    }

    public void setLpName(String lpName) {
        this.lpName = lpName;
    }

    public String getLpJd() {
        return lpJd;
    }

    public void setLpJd(String lpJd) {
        this.lpJd = lpJd;
    }

    public String getLpWd() {
        return lpWd;
    }

    public void setLpWd(String lpWd) {
        this.lpWd = lpWd;
    }

    public Long getLpBiNumber() {
        return lpBiNumber;
    }

    public void setLpBiNumber(Long lpBiNumber) {
        this.lpBiNumber = lpBiNumber;
    }

    public Long getLpLeaser() {
        return lpLeaser;
    }

    public void setLpLeaser(Long lpLeaser) {
        this.lpLeaser = lpLeaser;
    }
}