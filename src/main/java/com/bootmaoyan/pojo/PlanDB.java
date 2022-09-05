package com.bootmaoyan.pojo;

import java.util.Date;

public class PlanDB {
    private Integer id;
    private Integer fid;
    private Integer rid;
    private Date time;
    private Double price;
    private Integer cid;

    @Override
    public String toString() {
        return "PlanDB{" +
                "id=" + id +
                ", fid=" + fid +
                ", rid=" + rid +
                ", time=" + time +
                ", price=" + price +
                ", cid=" + cid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public PlanDB(Integer id, Integer fid, Integer rid, Date time, Double price, Integer cid) {
        this.id = id;
        this.fid = fid;
        this.rid = rid;
        this.time = time;
        this.price = price;
        this.cid = cid;
    }

    public PlanDB() {
    }
}
