package com.bootmaoyan.service;

import com.bootmaoyan.pojo.Film;
import com.bootmaoyan.pojo.Type_f;

import java.io.IOException;
import java.util.List;

public interface FilmInter {
    List<Film> showAllFilm() throws IOException;

    Film showByID(int id) throws IOException;

    List<Film> selectLikeName(String string) throws IOException;

    List<Film> selectByType(Type_f type_f) throws IOException;

    List<Film> selectByDateBefore() throws IOException;

    List<Film> selectByDateAfter() throws IOException;
}
