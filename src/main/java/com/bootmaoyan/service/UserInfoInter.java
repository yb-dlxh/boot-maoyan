package com.bootmaoyan.service;

import com.bootmaoyan.pojo.UserInfo;

import java.io.IOException;

public interface UserInfoInter {

     UserInfo selectByUid(UserInfo u) throws IOException;

     int upDate(UserInfo userInfo) throws IOException;
}
