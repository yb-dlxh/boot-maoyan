package com.bootmaoyan.service;

import com.bootmaoyan.pojo.SeatDB;

import java.io.IOException;
import java.util.List;

public interface SeatInter {

    List<SeatDB> selectBypid(int id) throws IOException;

    int insert(SeatDB seat) throws IOException;

    int upDate(SeatDB seat) throws IOException;

    int upDateBylid(int id) throws IOException;

}
