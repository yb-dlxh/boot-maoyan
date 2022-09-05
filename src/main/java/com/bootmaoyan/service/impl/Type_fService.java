package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.Type_fMapper;
import com.bootmaoyan.pojo.Type_f;
import com.bootmaoyan.service.Type_fInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class Type_fService implements Type_fInter {
    @Autowired
    private Type_fMapper mapper;
    @Override
    public Type_f selectById(Type_f id) throws IOException {

        Type_f type_f = mapper.selectById(id);
        return type_f;
    }
}
