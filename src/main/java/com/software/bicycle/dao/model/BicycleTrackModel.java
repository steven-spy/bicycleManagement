package com.software.bicycle.dao.model;

/**
 * 自行车轨迹实体类
 *
 * @author spy
 */
public class BicycleTrackModel {
    private int btId;
    private String btBicycleName;
    private String btOrJd;
    private String btOrWd;
    private String btPrJd;
    private String btPrWd;

    public int getBtId() {
        return btId;
    }

    public void setBtId(int btId) {
        this.btId = btId;
    }

    public String getBtBicycleName() {
        return btBicycleName;
    }

    public void setBtBicycleName(String btBicycleName) {
        this.btBicycleName = btBicycleName;
    }

    public String getBtOrJd() {
        return btOrJd;
    }

    public void setBtOrJd(String btOrJd) {
        this.btOrJd = btOrJd;
    }

    public String getBtOrWd() {
        return btOrWd;
    }

    public void setBtOrWd(String btOrWd) {
        this.btOrWd = btOrWd;
    }

    public String getBtPrJd() {
        return btPrJd;
    }

    public void setBtPrJd(String btPrJd) {
        this.btPrJd = btPrJd;
    }

    public String getBtPrWd() {
        return btPrWd;
    }

    public void setBtPrWd(String btPrWd) {
        this.btPrWd = btPrWd;
    }
}
