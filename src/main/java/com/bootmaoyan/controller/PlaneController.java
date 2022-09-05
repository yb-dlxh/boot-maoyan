package com.bootmaoyan.controller;

import com.alibaba.fastjson.JSONObject;
import com.bootmaoyan.pojo.Plan;
import com.bootmaoyan.service.impl.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
public class PlaneController {
  @Autowired
  private PlanService service;
    @RequestMapping("/ServletShowPlanBefore")
    public void showPlanBefore(String from, String id, HttpSession session, HttpServletResponse resp) throws IOException {

        if ("null".equals(from)){
//            System.out.println("brfore-----");
            session.setAttribute("from",null);
            session.setAttribute("id",null);
        }else {
            session.setAttribute("from",from);
            Integer id1 = Integer.valueOf(id);
            session.setAttribute("id",id1);
        }
        resp.sendRedirect("/html/showplan.html");
    }

    @RequestMapping("ServletShowPlan")
    public List<Plan> showPlan(HttpSession session) throws IOException {
        List<Plan> plans = null;
        Object from = session.getAttribute("from");
        if(from==null){
           plans = service.selectAll();
        }else if ("film".equals(from)){
//            System.out.println("电影 servlet ----------");
            Integer id=(Integer) session.getAttribute("id");
            plans = service.selectByFilm(id);
        }else if ("ciname".equals(from)){
//            System.out.println("ciname servlet ----------");

            Integer id=(Integer) session.getAttribute("id");
            plans = service.selectByCinema(id);
        }
        return plans;
    }
}
