package com.bootmaoyan.controller;

import com.alibaba.fastjson.JSONObject;
import com.bootmaoyan.pojo.SeatDB;
import com.bootmaoyan.pojo.UserListDB;
import com.bootmaoyan.service.UserListInter;
import com.bootmaoyan.service.impl.SeatService;
import com.bootmaoyan.service.impl.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class MyControlloer1 {
    @Autowired
    private SeatService ss;
    @Autowired
    private UserListService uls;
    @Autowired
    UserListInter ul ;
    @RequestMapping("/ServletButout")
    public int butout(String id) throws IOException {
        String lid = id.substring(1);
        int i = ss.upDateBylid(Integer.valueOf(lid));
        int delete = uls.delete(Integer.valueOf(lid));
        if (i*delete==0){
            return 1;
        }else {
            return 0;
        }
    }

    @RequestMapping("/ServletBuy")
     public String buy(String temp, HttpSession session) throws IOException {
        String[] as = temp.split("a");
        Integer userid =(Integer) session.getAttribute("userid");
        String saleplan =(String) session.getAttribute("saleplan");
        JSONObject json = JSONObject.parseObject(saleplan);
        String pid = json.getString("id");
        int pid1 = Integer.valueOf(pid);
        for (int i=0;i<as.length;i++){
            SeatDB seat= new SeatDB(Integer.valueOf(as[i]),null,null,null);
            ss.upDate(seat);
            UserListDB userListDB=new UserListDB(null,userid,Integer.valueOf(as[i]),pid1);
            ul.insert(userListDB);
        }
        session.removeAttribute("saleplan");
        return "<script>alert('购票成功');location.href='/html/userhome.html';</script>";


    }

    @RequestMapping("/ServletHeader")
    public String header(HttpSession session){
        Integer userid =(Integer) session.getAttribute("userid");
        if (userid==null){
            return "n";
        }else {
           return "y";
        }
    }


}
