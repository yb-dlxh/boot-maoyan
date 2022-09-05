package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.CinemaMapper;
import com.bootmaoyan.pojo.Cinema;
import com.bootmaoyan.service.CinemaInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class CinemaService implements CinemaInter {
    @Autowired
    private CinemaMapper mapper;

    @Override
    public List<Cinema> showAll() throws IOException {
        List<Cinema> list = mapper.selectAll();
        return list;

    }

    @Override
    public Cinema showByID(int id) throws IOException {
        Cinema list = mapper.showByID(id);
        return list;
    }
}
