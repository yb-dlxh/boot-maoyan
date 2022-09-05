package com.bootmaoyan.controller;

import com.bootmaoyan.pojo.User;
import com.bootmaoyan.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class LoginController {
    @Autowired
    private UserService us;
    @PostMapping ("/ServletLogin")
    public void login(User user, HttpSession session, HttpServletResponse resp) throws IOException {
        User u = us.selectLogin(user);
        if (u!=null){
//            设置登录状态
            session.setAttribute("userid",u.getId());
//           由电影页跳转来时跳回至电影页
            Object saleplan = session.getAttribute("saleplan");
//            System.out.println(saleplan);
            if(saleplan!=null){
                resp.sendRedirect("/html/sale.html");
            }else{
                resp.getWriter().print("<script> location.href='html/userhome.html'</script>");
            }
        }else {
            resp.setContentType("text/html");
            resp.getWriter().print("<script>alert('用户名密码不正确');location.href='html/login.html'</script>");
        }
    }

    @RequestMapping("/ServletLogout")
    public void logout(HttpServletResponse resp, HttpServletRequest req) throws IOException {
        req.getSession().removeAttribute("userid");
        resp.sendRedirect("/html/login.html");
    }


}
