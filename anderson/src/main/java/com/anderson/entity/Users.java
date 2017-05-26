package com.anderson.entity;

public class Users {
    private Integer uid;

    private String uloginname;

    private String upassword;

    private String ufirstname;

    private String ulastname;

    private Integer ustatus;

    private Integer upower;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUloginname() {
        return uloginname;
    }

    public void setUloginname(String uloginname) {
        this.uloginname = uloginname == null ? null : uloginname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUfirstname() {
        return ufirstname;
    }

    public void setUfirstname(String ufirstname) {
        this.ufirstname = ufirstname == null ? null : ufirstname.trim();
    }

    public String getUlastname() {
        return ulastname;
    }

    public void setUlastname(String ulastname) {
        this.ulastname = ulastname == null ? null : ulastname.trim();
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    public Integer getUpower() {
        return upower;
    }

    public void setUpower(Integer upower) {
        this.upower = upower;
    }
}