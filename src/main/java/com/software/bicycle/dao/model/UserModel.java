package com.software.bicycle.dao.model;

/**
 * 用户实体类
 *
 * @author spy
 */
public class UserModel {
    private int uId;
    private String uName;
    private int uAge;
    private String uSex;
    private String uPhone;
    private String uCard;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuCard() {
        return uCard;
    }

    public void setuCard(String uCard) {
        this.uCard = uCard;
    }
}
