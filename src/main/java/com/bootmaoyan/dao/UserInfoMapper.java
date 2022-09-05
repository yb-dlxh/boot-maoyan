package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    UserInfo selectByUid(UserInfo userInfo);

    int insert(UserInfo userInfo);

    int upDate(UserInfo userInfo);

}
