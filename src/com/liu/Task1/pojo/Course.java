package com.liu.Task1.pojo;

public class Course {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String coursecode;

    /**
     *
     */
    private String coursename;

    /**
     *
     */
    private Integer teacherid;

    /**
     *
     */
    private Integer coursescore;

    /**
     *
     */
    private Integer coursetime;

    /**
     *
     */
    private String description;

    /**
     *
     */
    private Integer useFlag;

    /**
     *
     */
    private String teacherName;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursecode='" + coursecode + '\'' +
                ", coursename='" + coursename + '\'' +
                ", teacherid=" + teacherid +
                ", coursescore=" + coursescore +
                ", coursetime=" + coursetime +
                ", description='" + description + '\'' +
                ", useFlag=" + useFlag +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public Integer getCoursescore() {
        return coursescore;
    }

    public void setCoursescore(Integer coursescore) {
        this.coursescore = coursescore;
    }

    public Integer getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(Integer coursetime) {
        this.coursetime = coursetime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}

