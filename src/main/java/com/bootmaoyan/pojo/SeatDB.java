package com.bootmaoyan.pojo;

public class SeatDB {
    private Integer id;
    private String no;
    private Integer pid;
    private Integer statu;

    @Override
    public String toString() {
        return "SeatDB{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", pid=" + pid +
                ", statu=" + statu +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public SeatDB(Integer id, String no, Integer pid, Integer statu) {
        this.id = id;
        this.no = no;
        this.pid = pid;
        this.statu = statu;
    }

    public SeatDB() {
    }
}
