package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.RoomMapper;
import com.bootmaoyan.pojo.Room;
import com.bootmaoyan.service.RoomInter;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class RoomService implements RoomInter {
   @Autowired
   private RoomMapper mapper;
    @Override
    public List<Room> selectAll() {
        return null;
    }

    @Override
    public List<Room> selectByCinema() {
        return null;
    }

    @Override
    public Room selectById(int id) throws IOException {
        Room list = mapper.selectById(id);
        return list;
    }

    @Override
    public int selectNum(Room room) {
        return 0;
    }

    @Override
    public int insert(Room room) {
        return 0;
    }
}
