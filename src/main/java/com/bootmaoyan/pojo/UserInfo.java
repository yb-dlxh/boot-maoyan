package com.bootmaoyan.pojo;

import java.util.Date;

public class UserInfo {
    private Integer id;
    private Integer uid;
    private String name;
    private String sex;
    private Date birthday;
    private String hobby;
    private String sign;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", hobby=" + (hobby) +
                ", sign='" + sign + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public UserInfo(Integer id, Integer uid, String name, String sex, Date birthday, String hobby, String sign) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.hobby = hobby;
        this.sign = sign;
    }

    public UserInfo() {
    }
}
