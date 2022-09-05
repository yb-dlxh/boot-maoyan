package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.UserInfoMapper;
import com.bootmaoyan.pojo.UserInfo;
import com.bootmaoyan.service.UserInfoInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class UserInfoService implements UserInfoInter {
    @Autowired
    private UserInfoMapper mapper;
    @Override
    public UserInfo selectByUid(UserInfo u) throws IOException {

        UserInfo uinfo = mapper.selectByUid(u);
        return uinfo ;

    }

    @Override
    public int upDate(UserInfo userInfo) throws IOException {
        int i = mapper.upDate(userInfo);

        return i;
    }
}
