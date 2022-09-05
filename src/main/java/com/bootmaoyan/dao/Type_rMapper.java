package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.Type_r;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Type_rMapper {
    List<Type_r> selectAll();
}
