package com.bootmaoyan.pojo;

public class Room {
    private Integer id;
    private Cinema cinema;
    private String name;
    private Type_r type;
    private Integer seat_count;
//    座位布局方式备用
    private String posimg;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", cid=" + cinema +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", seat_count=" + seat_count +
                ", posimg='" + posimg + '\'' +
                '}';
    }

    public Room(Integer id, Cinema cinema, String name, Type_r type, Integer seat_count, String posimg) {
        this.id = id;
        this.cinema = cinema;
        this.name = name;
        this.type = type;
        this.seat_count = seat_count;
        this.posimg = posimg;
    }

    public Room() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cinema getCid() {
        return cinema;
    }

    public void setCid(Cinema cid) {
        this.cinema = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type_r getType() {
        return type;
    }

    public void setType(Type_r type) {
        this.type = type;
    }

    public Integer getSeat_count() {
        return seat_count;
    }

    public void setSeat_count(Integer seat_count) {
        this.seat_count = seat_count;
    }

    public String getPosimg() {
        return posimg;
    }

    public void setPosimg(String posimg) {
        this.posimg = posimg;
    }
}
