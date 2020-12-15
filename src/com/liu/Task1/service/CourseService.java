package com.liu.Task1.service;

import com.liu.Task1.dao.courseDao;
import com.liu.Task1.pojo.Course;

import java.util.List;

public class CourseService implements courseDao {
    @Override
    public boolean addCourse(Course course) {
        return false;
    }

    @Override
    public boolean updateCourse(Course course) {
        return false;
    }

    @Override
    public boolean deleteCourse(String courseId) {
        return false;
    }

    @Override
    public Course selectCourse(String courseId) {
        return null;
    }

    @Override
    public List<Course> selectAllCourses() {
        return null;
    }
}
