package com.bootmaoyan.dao;

import com.bootmaoyan.pojo.FilmDB;
import com.bootmaoyan.pojo.Type_f;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FilmMapper {

      List<FilmDB> selectAll();

      List<FilmDB> selectByType(Type_f type_f);

      List<FilmDB> selectLikeName(String string);

      List<FilmDB> selectByDateBefore();

      List<FilmDB> selectByDateAfter();

      List<FilmDB> selectByID(int i);

      int insertFilm(FilmDB film);

      int delectFilm(FilmDB film);
}
