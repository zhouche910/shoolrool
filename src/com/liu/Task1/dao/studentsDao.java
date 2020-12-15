package com.liu.Task1.dao;

import com.liu.Task1.pojo.Students;
import com.liu.Task1.pojo.Users;

import java.util.List;

public interface studentsDao {
    public boolean login (String username ,String password);

    public void  deletestudents(String username);

    public  void  updatestudents(Students students);

    public List<Students> searchAllUstudents();

    public   Students searchUstudents(String username);

    public   boolean Addstudents(Students students);
}
