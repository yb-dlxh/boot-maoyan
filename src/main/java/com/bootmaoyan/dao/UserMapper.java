package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    List<User> selectAll();

    User selectLogin(User user);

    User selectById(User user);

    int insert(User user);

}
