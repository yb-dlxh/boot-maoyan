package com.bootmaoyan.controller;

import com.alibaba.fastjson.JSONObject;
import com.bootmaoyan.pojo.Orderlist;
import com.bootmaoyan.pojo.UserInfo;
import com.bootmaoyan.service.UserInfoInter;
import com.bootmaoyan.service.impl.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserInfoInter service ;
    @Autowired
    private UserListService listService;
    @GetMapping("ServletUserinfo")
    public String userInfo(HttpSession session) throws IOException {
        Integer userid = (Integer) session.getAttribute("userid");
        if (userid!=null){
            UserInfo userInfo=new UserInfo();
            userInfo.setUid(userid);
            UserInfo userInfo1 = service.selectByUid(userInfo);
            String s = JSONObject.toJSONString(userInfo1);
            return s;
        }else {
           return "null";
        }
    }

    @GetMapping("ServletUserinfoOrderlist")
    public String userOrderList(HttpSession session) throws IOException {
        Integer userid =(Integer) session.getAttribute("userid");
        List<Orderlist> orderlists = listService.selsctByuid(userid);
        String s = JSONObject.toJSONString(orderlists);
        return s;
    }

    @GetMapping("ServletUserinfoUpdate")
    public void update(HttpServletRequest req, HttpServletResponse resp) throws  Exception{
        //判断是否已经登录
        Integer userid = (Integer) req.getSession().getAttribute("userid");
        if (userid!=null){
//            修改数据
            String name = req.getParameter("name");
            String sex = req.getParameter("sex");
            String birthday = req.getParameter("birthday");
            String[] hobbies = req.getParameterValues("hobby");
            String hobby;
            if (hobbies==null){
                hobby="";
            }else {
//                System.out.println(Arrays.toString(hobbies));
                int l= Arrays.toString(hobbies).length();
//            System.out.println("l-"+l);
                hobby = Arrays.toString(hobbies).substring(1,l-1).replace(" ","");
            }
//
            String sign = req.getParameter("sign");
            Date bir=null;
            try {
                if (birthday!=null){
                    bir=new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            UserInfo upuser=new UserInfo(null,userid,name,sex,bir,hobby,sign);
            int i = service.upDate(upuser);
            //取数据刷新页面
//            UserInfo userInfo=new UserInfo();
//            userInfo.setUid(userid);
//            UserInfo userInfo1 = u.selectByUid(userInfo);
//            String s = JSONObject.toJSONString(userInfo1);

            resp.sendRedirect("/html/userhome.html");
//            resp.getWriter().print(s);
        }else {
            resp.getWriter().print("s");
//            resp.getWriter().print("<script> location.href='/html/login.html';</script>");
        }
    }
}
