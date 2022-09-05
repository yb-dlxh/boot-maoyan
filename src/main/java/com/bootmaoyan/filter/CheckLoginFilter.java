package com.bootmaoyan.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("/*/userhome.html")
public class CheckLoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      HttpServletRequest req= (HttpServletRequest)request;
        HttpServletResponse resp = (HttpServletResponse) response;
        Integer userid = (Integer) req.getSession().getAttribute("userid");
        System.out.println(userid);
        if(userid==null){
//            resp.sendRedirect("/html/login.html");
            resp.getWriter().print("s");
            System.out.println("----------filter");
        }
        chain.doFilter(request,response);
    }
}
