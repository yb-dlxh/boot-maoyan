package com.bootmaoyan.pojo;

public class UserListDB<R> {
    private Integer id;
    private Integer uid;
    private Integer sid;
    private Integer pid;

    public UserListDB(Integer id, Integer uid, Integer sid, Integer pid) {
        this.id = id;
        this.uid = uid;
        this.sid = sid;
        this.pid = pid;
    }

    public UserListDB() {
    }

    @Override
    public String toString() {
        return "UserListDB{" +
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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
