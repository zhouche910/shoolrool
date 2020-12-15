package com.liu.Task1.service;

import com.liu.Task1.dao.studentsDao;
import com.liu.Task1.pojo.Students;

import java.util.List;

public class StudentsService implements studentsDao {
    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void deletestudents(String username) {

    }

    @Override
    public void updatestudents(Students students) {

    }

    @Override
    public List<Students> searchAllUstudents() {
        return null;
    }

    @Override
    public Students searchUstudents(String username) {
        return null;
    }

    @Override
    public boolean Addstudents(Students students) {
        return false;
    }
}
