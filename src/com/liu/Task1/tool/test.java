package com.liu.Task1.tool;

import com.liu.Task1.service.UsersService;

public class test {
    public static void main(String[] args) {
        UsersService usersService=new UsersService();
//        System.out.println( usersService.searchAllUsers());
//        System.out.println(usersService.searchUsers("liuming"));
        System.out.println(usersService.login("zhou","123456"));
    }
}
