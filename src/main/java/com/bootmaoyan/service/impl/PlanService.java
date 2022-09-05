package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.PlanMapper;
import com.bootmaoyan.pojo.*;
import com.bootmaoyan.service.PlanInter;
import org.apache.ibatis.session.SqlSession;
import com.bootmaoyan.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class PlanService implements PlanInter {
    @Autowired
    private PlanMapper mapper;
    @Autowired
    private  FilmService fs;
    @Autowired
    private  RoomService rs;
    @Autowired
    private  CinemaService cs;
    @Override
    public List<Plan> selectAll() throws IOException {

        List<PlanDB> list = mapper.selectAll();
        List<Plan> list1=new ArrayList<>();

        for (int i=0;i<list.size();i++){
            Integer fid = list.get(i).getFid();
            Integer rid = list.get(i).getRid();
            Integer cid = list.get(i).getCid();
            Film film= fs.showByID(fid);
            Room room = rs.selectById(rid);
            Cinema cinema=cs.showByID(cid);
            Plan p=new Plan(list.get(i).getId(),film,room,list.get(i).getTime(),list.get(i).getPrice(),cinema);
            list1.add(p);
        }

        return list1;
    }

    @Override
    public List<Plan> selectByUser(int id) throws IOException {
        List<PlanDB> list = mapper.selectByUser(id);

        List<Plan> list1=new ArrayList<>();

        for (int i=0;i<list.size();i++){
            Integer fid = list.get(i).getFid();
            Integer rid = list.get(i).getRid();
            Integer cid = list.get(i).getCid();
            Film film=fs.showByID(fid);
            Room room = rs.selectById(rid);
            Cinema cinema=cs.showByID(cid);
            Plan p=new Plan(list.get(i).getId(),film,room,list.get(i).getTime(),list.get(i).getPrice(),cinema);
            list1.add(p);
        }

        return list1;
    }

    @Override
    public List<Plan> selectByFilm(int id) throws IOException {
        List<PlanDB> list = mapper.selectByFilm(id);
        List<Plan> list1=new ArrayList<>();

        for (int i=0;i<list.size();i++){
            Integer fid = list.get(i).getFid();
            Integer rid = list.get(i).getRid();
            Integer cid = list.get(i).getCid();
            Film film= fs.showByID(fid);
            Room room = rs.selectById(rid);
            Cinema cinema= cs.showByID(cid);
            Plan p=new Plan(list.get(i).getId(),film,room,list.get(i).getTime(),list.get(i).getPrice(),cinema);
            list1.add(p);
        }

        return list1;
    }

    @Override
    public List<Plan> selectByCinema(int id) throws IOException {
        List<PlanDB> list = mapper.selectByCinema(id);


        List<Plan> list1=new ArrayList<>();

        for (int i=0;i<list.size();i++){
            Integer fid = list.get(i).getFid();
            Integer rid = list.get(i).getRid();
            Integer cid = list.get(i).getCid();
            Film film= fs.showByID(fid);
            Room room = rs.selectById(rid);
            Cinema cinema=cs.showByID(cid);
            Plan p=new Plan(list.get(i).getId(),film,room,list.get(i).getTime(),list.get(i).getPrice(),cinema);
            list1.add(p);
        }
        return list1;
    }

    @Override
    public List<Plan> selectByDate(Date date) {
        return null;
    }

    @Override
    public int insertPlan(Plan plan) {
        return 0;
    }

    @Override
    public int delectFilm(Plan plan) {
        return 0;
    }
}
