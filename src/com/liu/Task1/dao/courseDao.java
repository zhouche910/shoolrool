package com.liu.Task1.dao;

import com.liu.Task1.pojo.Course;

import java.util.List;

public interface courseDao {
    public  boolean addCourse(Course course);

    public  boolean updateCourse( Course course);
    public  boolean deleteCourse( String courseId);
    public  Course selectCourse( String courseId);
    public  List<Course> selectAllCourses();

}
