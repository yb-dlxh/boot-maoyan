package com.bootmaoyan.pojo;

public class Type_r {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Type_r{" +
                "id=" + id +
                ", name='" + name + '\'' +
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

    public Type_r(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Type_r() {
    }
}
