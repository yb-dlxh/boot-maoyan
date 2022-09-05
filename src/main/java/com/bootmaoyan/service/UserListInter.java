package com.bootmaoyan.service;

import com.bootmaoyan.pojo.Orderlist;
import com.bootmaoyan.pojo.UserListDB;

import java.io.IOException;
import java.util.List;

public interface UserListInter {

    List<Orderlist> selsctByuid(int id) throws IOException;

    int insert(UserListDB userList) throws IOException;

    int delete(int id) throws IOException;
}
