package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.Cinema;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CinemaMapper {

        List<Cinema> selectAll();

        Cinema showByID(int id);

}
