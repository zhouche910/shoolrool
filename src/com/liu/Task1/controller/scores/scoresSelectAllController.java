package com.liu.Task1.controller.scores;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class scoresSelectAllController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }

    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
