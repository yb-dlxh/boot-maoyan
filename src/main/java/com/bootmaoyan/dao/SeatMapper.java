package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.Seat;
import com.bootmaoyan.pojo.SeatDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SeatMapper {

      List<Seat> selectAll();

      List<SeatDB> selectBypid(int id);

      int upDate(SeatDB seat);

      int upDateBylid(int id);

      int insert(SeatDB seat);
}
