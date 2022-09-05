package com.bootmaoyan.service;

import com.bootmaoyan.pojo.Cinema;

import java.io.IOException;
import java.util.List;

public interface CinemaInter {

     List<Cinema> showAll() throws IOException;

     Cinema showByID(int id) throws IOException;

}
