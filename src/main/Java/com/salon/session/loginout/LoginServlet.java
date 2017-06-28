package com.salon.session.loginout;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gaogao on 2017/6/29.
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //获取用户密码
        String getName=request.getParameter("username");
        String getPs=request.getParameter("password");
        //查询数据库确认用户密码
        if (UserDao.valiNamePsw(getName,getPs)){
            //正确重定向到主页
            request.getSession().setAttribute("user",getName);
            response.sendRedirect(request.getContextPath()+"/SessionLoginoff/index.jsp");
            return;
        }else {
            //错误提示
            response.getWriter().write("用户名密码不正确！");

        }
    }
}
