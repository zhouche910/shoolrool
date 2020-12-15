package com.liu.Task1.pojo;

import java.util.Date;

public class Scores {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Integer studentid;

    /**
     *
     */
    private Integer courseid;

    /**
     *
     */
    private String examtype;

    /**
     *
     */
    private Integer score;

    /**
     *
     */
    private Date examdate;

    /**
     *
     */
    private Integer status;

    /**
     *
     */
    private Integer useFlag;

    @Override
    public String toString() {
        return "Scores{" +
                "id=" + id +
                ", studentid=" + studentid +
                ", courseid=" + courseid +
                ", examtype='" + examtype + '\'' +
                ", score=" + score +
                ", examdate=" + examdate +
                ", status=" + status +
                ", useFlag=" + useFlag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getExamdate() {
        return examdate;
    }

    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }
}

