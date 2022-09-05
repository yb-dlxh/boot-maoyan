package com.bootmaoyan.pojo;

public class Type_f {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Type_f{" +
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

    public Type_f(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Type_f() {
    }
}
