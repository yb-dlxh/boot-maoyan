package com.bootmaoyan.pojo;

import java.util.Date;

public class Plan {

    private Integer id;
    private Film fid;
    private Room rid;
    private Date time;
    private Double price;
    private Cinema cid;

    @Override
    public String toString() {
        return "Plan{" +
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

    public Film getFid() {
        return fid;
    }

    public void setFid(Film fid) {
        this.fid = fid;
    }

    public Room getRid() {
        return rid;
    }

    public void setRid(Room rid) {
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

    public Cinema getCid() {
        return cid;
    }

    public void setCid(Cinema cid) {
        this.cid = cid;
    }

    public Plan(Integer id, Film fid, Room rid, Date time, Double price, Cinema cid) {
        this.id = id;
        this.fid = fid;
        this.rid = rid;
        this.time = time;
        this.price = price;
        this.cid = cid;
    }

    public Plan() {
    }
}
