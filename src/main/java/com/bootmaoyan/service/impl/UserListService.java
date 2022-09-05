package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.UserListMapper;
import com.bootmaoyan.pojo.Orderlist;
import com.bootmaoyan.pojo.UserListDB;
import com.bootmaoyan.service.UserListInter;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class UserListService implements UserListInter {
    @Autowired
    private UserListMapper mapper;
    @Override
    public List<Orderlist> selsctByuid(int id) throws IOException {

        List<Orderlist> orderlists = mapper.selsctByuid(id);

        return orderlists;
    }

    @Override
    public int insert(UserListDB userList) throws IOException {


        int i = mapper.insert(userList);

        return i;

    }

    @Override
    public int delete(int id) throws IOException {

        int i = mapper.delete(id);

        return i;
    }
}
