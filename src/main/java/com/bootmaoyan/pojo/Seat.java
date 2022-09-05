package com.bootmaoyan.pojo;

public class Seat {
    private Integer id;
    private String no;
    private Plan pid;
    private Integer statu;

    @Override
    public String toString() {
        return "Seat{" +
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

    public Plan getPid() {
        return pid;
    }

    public void setPid(Plan pid) {
        this.pid = pid;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public Seat(Integer id, String no, Plan pid, Integer statu) {
        this.id = id;
        this.no = no;
        this.pid = pid;
        this.statu = statu;
    }

    public Seat() {
    }
}
