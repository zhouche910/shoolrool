package com.liu.Task1.dao;

import com.liu.Task1.pojo.Users;

import java.util.List;

public interface usersDao {
    public boolean login (String username ,String password);

    public boolean  deleteuser(String username);

    public  boolean  updateuser(String username ,String password);

    public  List<Users> searchAllUsers();

    public   Users searchUsers(String username);

    public   boolean AddUsers(Users users);
}
