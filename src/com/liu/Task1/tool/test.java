package com.liu.Task1.tool;

import com.liu.Task1.pojo.Users;
import com.liu.Task1.service.UsersService;
import net.sf.json.JSONArray;

import java.util.List;

public class test {
    public static void main(String[] args) {
        UsersService usersService=new UsersService();
//        System.out.println( usersService.searchAllUsers());
//        System.out.println(usersService.searchUsers("liumin"));
//        System.out.println(usersService.login("liuming","123456"));
//        System.out.println(usersService.AddUsers(usersService.searchUsers("liuming")));
//        System.out.println( usersService.updateuser("liumin","12345622"));
//        System.out.println(usersService.deleteuser("shu"));


        List<Users> users=usersService.searchAllUsers();
        JSONArray jsonArray =JSONArray.fromObject(users);
        System.out.println(jsonArray);
    }
}
