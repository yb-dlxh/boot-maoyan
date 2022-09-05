package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RoomMapper {

     List<Room> selectAll();

     List<Room> selectByCinema();

     Room selectById(int id);

     int selectNum(Room room);

     int insert(Room room);

}
