package com.bootmaoyan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bootmaoyan.pojo.Cinema;
import com.bootmaoyan.pojo.Film;
import com.bootmaoyan.pojo.Plan;
import com.bootmaoyan.pojo.Type_f;
import com.bootmaoyan.service.CinemaInter;
import com.bootmaoyan.service.FilmInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
public class ShowController {
    @Autowired
    private FilmInter service;
    @Autowired
    private CinemaInter cinemaService;
    @RequestMapping("/ServletShowAllFilm")
    public String showAllFile(HttpSession session) throws IOException {
        String s = (String) session.getAttribute("likename");
        if (s!=null){
            session.removeAttribute("likename");
            return s;
        }else {
            List<Film> list = service.showAllFilm();
            return JSON.toJSONString(list);
        }

    }

    @RequestMapping("/ServletShowFilmBytype")
    public List<Film> showFilmBytype(String type ) throws IOException {
        Type_f t =new Type_f();
        t.setId(Integer.valueOf(type));
        List<Film> list = service.selectByType(t);
        return list;
    }

    @RequestMapping("/ServletShowFilmBydate")
    public List<Film> showFilmBydate(String th) throws IOException {
        List<Film> list = null;
        if ("on".equals(th)) {
            list = service.selectByDateBefore();
        } else {
            list = service.selectByDateAfter();
        }
        return list;
    }

    @RequestMapping("/ServletShowLikenameFilm")
    public String showLikenameFilm(HttpServletRequest req) throws IOException {
        String parameter = req.getParameter("likename");
        List<Film> list = service.selectLikeName("%"+parameter+"%");
        String s = JSONObject.toJSONString(list);
        req.getSession().setAttribute("likename",s);
        return "<script>window.parent.location.href='/html/showfilm.html;'</script>";
    }

    @RequestMapping("/ServletShowAllCinema")
    public List<Cinema> showAllCinema() throws IOException {
        List<Cinema> list = cinemaService.showAll();
        return list;
    }


}
