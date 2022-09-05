package com.bootmaoyan.pojo;

import java.util.Date;

public class Orderlist {
    private Date time;
    private String fname;
    private String cname;
    private String rname;
    private String no;
    private Double price;
    private Integer id;

    public Orderlist(Date time, String fname, String cname, String rname, String no, Double price, Integer id) {
        this.time = time;
        this.fname = fname;
        this.cname = cname;
        this.rname = rname;
        this.no = no;
        this.price = price;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Orderlist{" +
                "time=" + time +
                ", fname='" + fname + '\'' +
                ", cname='" + cname + '\'' +
                ", rname='" + rname + '\'' +
                ", no='" + no + '\'' +
                ", price=" + price +
                '}';
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Orderlist(Date time, String fname, String cname, String rname, String no, Double price) {
        this.time = time;
        this.fname = fname;
        this.cname = cname;
        this.rname = rname;
        this.no = no;
        this.price = price;
    }

    public Orderlist() {
    }
}
