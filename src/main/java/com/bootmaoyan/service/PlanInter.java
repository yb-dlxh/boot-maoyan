package com.bootmaoyan.service;

import com.bootmaoyan.pojo.Plan;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface PlanInter {
    List<Plan> selectAll() throws IOException;

    List<Plan> selectByUser(int id) throws IOException;

    List<Plan> selectByFilm(int id) throws IOException;

    List<Plan> selectByCinema(int id) throws IOException;

    List<Plan> selectByDate(Date date);

    int insertPlan(Plan plan);

    int delectFilm(Plan plan);
}
