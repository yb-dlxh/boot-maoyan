package com.bootmaoyan.controller;

import com.alibaba.fastjson.JSONObject;
import com.bootmaoyan.pojo.Room;
import com.bootmaoyan.pojo.SeatDB;
import com.bootmaoyan.service.impl.RoomService;
import com.bootmaoyan.service.impl.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
public class SaleController {
    @Autowired
    private SeatService seatService;
    @Autowired
    private RoomService rs;
    @PostMapping("ServletSale")
    public void sale(String plan, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getSession().setAttribute("saleplan",plan);
//        判断是否登录
        Object userid = req.getSession().getAttribute("userid");
        if (userid==null){
//            未登录
//            RequestDispatcher rd = req.getRequestDispatcher("/html/login.html");
//            rd.forward(req,resp);
            resp.sendRedirect("/html/login.html");
        }else {
//            已登录
//            System.out.println(plan);
            resp.sendRedirect("/html/sale.html");
        }
    }

    @GetMapping("ServletSaleInit")
    public String saleinit(HttpSession session){
        String saleplan =(String)session.getAttribute("saleplan");
        return saleplan;
    }

    @GetMapping("ServletSaleInitSeat")
    public String saleInitSeat(HttpSession session) throws IOException {
        String saleplan =(String) session.getAttribute("saleplan");
//        拿出放映计划
        JSONObject json = JSONObject.parseObject(saleplan);
        String pid = json.getString("id");
        int pid1 = Integer.valueOf(pid);

        List<SeatDB> seats = seatService.selectBypid(pid1);
//        座位没有被创建创建座位
        if (seats.size()==0){
            //        拿出放映厅
            String room = json.getString("rid");
            JSONObject jsonroom = JSONObject.parseObject(room);
            String rid = jsonroom.getString("id");
            Room room1 = rs.selectById(Integer.valueOf(rid));

            for (int i=1;i<=room1.getSeat_count();i++){
                SeatDB seatDB = new SeatDB();
                seatDB.setNo(""+i);
                seatDB.setPid(pid1);
                seatDB.setStatu(0);
                seatService.insert(seatDB);
            }
            seats = seatService.selectBypid(pid1);
        }
        String s = JSONObject.toJSONString(seats);
       return s;
    }

}
