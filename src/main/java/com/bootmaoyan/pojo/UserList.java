package com.bootmaoyan.pojo;

public class UserList<R> {
    private Integer id;
    private User uid;
    private Seat sid;
    private Plan pid;

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", uid=" + uid +
                ", sid=" + sid +
                ", pid=" + pid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }

    public Seat getSid() {
        return sid;
    }

    public void setSid(Seat sid) {
        this.sid = sid;
    }

    public Plan getPid() {
        return pid;
    }

    public void setPid(Plan pid) {
        this.pid = pid;
    }

    public UserList(Integer id, User uid, Seat sid, Plan pid) {
        this.id = id;
        this.uid = uid;
        this.sid = sid;
        this.pid = pid;
    }

    public UserList() {
    }
}
