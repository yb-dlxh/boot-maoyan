package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.UserMapper;
import com.bootmaoyan.pojo.User;
import com.bootmaoyan.service.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class UserService implements UserServiceInter {
    @Autowired
    private UserMapper mapper;
    @Override
    public User selectLogin(User user) throws IOException {

        User u= mapper.selectLogin(user);

        return u;
    }
}
