package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.Type_f;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Type_fMapper {

    List<Type_f> selectAll();

    Type_f selectById(Type_f id);

}
