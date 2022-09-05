package com.bootmaoyan.service;

import com.bootmaoyan.pojo.Room;

import java.io.IOException;
import java.util.List;

public interface RoomInter {
    List<Room> selectAll();

    List<Room> selectByCinema();

    Room selectById(int id) throws IOException;

    int selectNum(Room room);

    int insert(Room room);
}
