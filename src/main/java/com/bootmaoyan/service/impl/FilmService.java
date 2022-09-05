package com.bootmaoyan.service.impl;

import com.bootmaoyan.dao.FilmMapper;
import com.bootmaoyan.pojo.Film;
import com.bootmaoyan.pojo.FilmDB;
import com.bootmaoyan.pojo.Type_f;
import com.bootmaoyan.service.FilmInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Transactional
@Service
public class FilmService implements FilmInter {
    @Autowired
    private FilmMapper mapper;

    @Autowired
    Type_fService t;
    @Override
    public List<Film> showAllFilm() throws IOException {
        List<FilmDB> list = mapper.selectAll();
        List<Film> list1 = getFilms(list);
        return list1;
    }

    @Override
    public Film showByID(int id) throws IOException {
        List<FilmDB> list = mapper.selectByID(id);
        List<Film> list1 = getFilms(list);
        return list1.get(0);
    }

    @Override
    public List<Film> selectLikeName(String string) throws IOException {
        List<FilmDB> list = mapper.selectLikeName(string);
        List<Film> list1 = getFilms(list);
        return list1;
    }

    @Override
    public List<Film> selectByType(Type_f type_f) throws IOException {
        List<FilmDB> list = mapper.selectByType(type_f);
        List<Film> list1 = getFilms(list);

        return list1;
    }

    @Override
    public List<Film> selectByDateBefore() throws IOException {

        List<FilmDB> list = mapper.selectByDateBefore();
        List<Film> list1 = getFilms(list);

        return list1;
    }

    @Override
    public List<Film> selectByDateAfter() throws IOException {

        List<FilmDB> list = mapper.selectByDateAfter();

        List<Film> list1 = getFilms(list);

        return list1;
    }


    // List<FilmDB>集合转 List<Film>集合
    private List<Film> getFilms(List<FilmDB> list) throws IOException {
        List<Film> list1=new ArrayList<>();
//        System.out.println(list);
        for (int i = 0; i< list.size(); i++){
//            System.out.println(list.get(i));
           Integer i1= list.get(i).getType1();
           Integer i2= list.get(i).getType2();
           Integer i3= list.get(i).getType3();
           Film f =new Film(list.get(i).getId(), list.get(i).getName(),
                   list.get(i).getDate(),chenge(i1),chenge(i2),chenge(i3), list.get(i).getDra(), list.get(i).getImgno());
            list1.add(f);
        }
        return list1;
    }
//    类型转换
       private Type_f chenge(Integer i) throws IOException {

           return t.selectById(new Type_f(i,null));
       }

}
