package com.bootmaoyan.pojo;

import java.util.Date;

public class Film {
    private Integer id;
    private String name ;
    private Date date;
    private Type_f type1;
    private Type_f type2;
    private Type_f type3;
    private String dra;
    private String imgno;

    @Override
    public String toString() {
        return "film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", type3=" + type3 +
                ", dra='" + dra + '\'' +
                ", imgno='" + imgno + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Type_f getType1() {
        return type1;
    }

    public void setType1(Type_f type1) {
        this.type1 = type1;
    }

    public Type_f getType2() {
        return type2;
    }

    public void setType2(Type_f type2) {
        this.type2 = type2;
    }

    public Type_f getType3() {
        return type3;
    }

    public void setType3(Type_f type3) {
        this.type3 = type3;
    }

    public String getDra() {
        return dra;
    }

    public void setDra(String dra) {
        this.dra = dra;
    }

    public String getImgno() {
        return imgno;
    }

    public void setImgno(String imgno) {
        this.imgno = imgno;
    }

    public Film(Integer id, String name, Date date, Type_f type1, Type_f type2, Type_f type3, String dra, String imgno) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.dra = dra;
        this.imgno = imgno;
    }

    public Film() {
    }
}
