package com.liu.Task1.controller.users;

import com.liu.Task1.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class usersloginController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }

    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username"); //得到jsp页面传过来的参数
        String password = request.getParameter("userpassword");

        UsersService usersService = new UsersService();
        if (usersService.login(username,password)) {
            // 向request域中放置信息
            request.getRequestDispatcher("index.jsp").forward(request, response);
            //转发到成功页面
        } else {
            response.sendRedirect("login.jsp");
            //重定向到首页
        }
    }
}
