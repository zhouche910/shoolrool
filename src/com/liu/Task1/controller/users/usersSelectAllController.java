package com.liu.Task1.controller.users;


import com.liu.Task1.pojo.Users;
import com.liu.Task1.service.UsersService;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class usersSelectAllController  extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }

    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsersService usersService =new UsersService();
        List<Users> users=usersService.searchAllUsers();
        JSONArray jsonArray =JSONArray.fromObject(users);
        PrintWriter printWriter = response.getWriter();
        printWriter.println(jsonArray);
        printWriter.flush();
        printWriter.close();
//        if (true) {
//            // 向request域中放置信息
//            request.getRequestDispatcher("index.jsp").forward(request, response);
//            //转发到成功页面
//        } else {
//            response.sendRedirect("InstructorLogin.jsp");
//            //重定向到首页
//        }
    }
}
