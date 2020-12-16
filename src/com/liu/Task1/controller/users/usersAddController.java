package com.liu.Task1.controller.users;

import com.liu.Task1.pojo.Users;
import com.liu.Task1.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class usersAddController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }

    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username =request.getParameter("addUsername");
            String userPassword =request.getParameter("addPassword");
            String userTypes=request.getParameter("addUserTypes");
            int userFlag =Integer.parseInt(request.getParameter("addUserFlag"));
        UsersService usersService=new UsersService();
        Users users=new Users(1,username,userPassword,userTypes,userFlag);
        if (usersService.AddUsers(users)) {
            PrintWriter printWriter = response.getWriter();
            printWriter.println("addSucceed");
            printWriter.flush();
            printWriter.close();
        } else {
            PrintWriter printWriter = response.getWriter();
            printWriter.println("errrr");
            printWriter.flush();
            printWriter.close();
       }
    }

}
