package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.Plan;
import com.bootmaoyan.pojo.PlanDB;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;
@Mapper
public interface PlanMapper {

    List<PlanDB> selectAll();

    List<PlanDB> selectByUser(int id);

    List<PlanDB> selectByFilm(int id);

    List<PlanDB> selectByCinema(int id);

    List<PlanDB> selectByDate(Date date);

    int insertPlan(Plan plan);

    int delectFilm(Plan plan);

}
