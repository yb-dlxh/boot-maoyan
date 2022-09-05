package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.Orderlist;
import com.bootmaoyan.pojo.UserListDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserListMapper {

    List<Orderlist> selsctByuid(int id);

    int insert(UserListDB userList);

    int delete(int id);
}
