package com.liu.Task1.dao;

import com.liu.Task1.pojo.Users;

import java.util.List;

public interface usersDao {
    public boolean login (String username ,String password);

    public void  deleteuser(String username);

    public  void  updateuser(Users users);

    public  List<Users> searchAllUsers();

    public   Users searchUsers(String username);

    public   boolean AddUsers(Users users);
}
