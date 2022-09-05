package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.SeatMapper;
import com.bootmaoyan.pojo.SeatDB;
import com.bootmaoyan.service.SeatInter;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class SeatService implements SeatInter {
    @Autowired
    private SeatMapper mapper;
    @Override
    public List<SeatDB> selectBypid(int id) throws IOException {
        List<SeatDB> list = mapper.selectBypid(id);
        return list;
    }

    @Override
    public int insert(SeatDB seat) throws IOException {
        int i = mapper.insert(seat);
        return i;
    }

    @Override
    public int upDate(SeatDB seat) throws IOException {

        int i = mapper.upDate(seat);
        return i;
    }

    @Override
    public int upDateBylid(int id) throws IOException {

        int i = mapper.upDateBylid(id);
        return i;
    }
}
