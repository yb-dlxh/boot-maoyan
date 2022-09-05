package com.bootmaoyan.service;

import com.bootmaoyan.pojo.User;

import java.io.IOException;

public interface UserServiceInter {

    User selectLogin(User user) throws IOException;

}
