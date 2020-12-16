package com.liu.Task1.controller.users;

import com.liu.Task1.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class usersDeleController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }

    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UsersService usersService=new UsersService();
        response.setContentType("text/html");
        try {
            String[] deleteList = request.getParameterValues("deleteList[]");
            if(deleteList !=null){
                for(String deleteListid:deleteList){
                    System.out.println(deleteListid);
                    usersService.deleteuser(deleteListid);
                }
            }else{
                System.out.println("获取数组参数失败!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
