package com.liu.Task1.pojo;

import java.util.Date;

public class Students {
    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", loginid=" + loginid +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", cardid='" + cardid + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", classname='" + classname + '\'' +
                ", studycode='" + studycode + '\'' +
                ", politicallandscape='" + politicallandscape + '\'' +
                ", nationality='" + nationality + '\'' +
                ", familyaddress='" + familyaddress + '\'' +
                ", useFlag=" + useFlag +
                ", type='" + type + '\'' +
                '}';
    }

    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Integer loginid;

    /**
     *
     */
    private String code;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String cardid;

    /**
     *
     */
    private Integer age;

    /**
     *
     */
    private Integer sex;

    /**
     *
     */
    private Date birthday;

    /**
     *
     */
    private String classname;

    /**
     *
     */
    private String studycode;

    /**
     *
     */
    private String politicallandscape;

    /**
     *
     */
    private String nationality;

    /**
     *
     */
    private String familyaddress;

    /**
     *
     */
    private Integer useFlag;

    /**
     *
     */
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getStudycode() {
        return studycode;
    }

    public void setStudycode(String studycode) {
        this.studycode = studycode;
    }

    public String getPoliticallandscape() {
        return politicallandscape;
    }

    public void setPoliticallandscape(String politicallandscape) {
        this.politicallandscape = politicallandscape;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFamilyaddress() {
        return familyaddress;
    }

    public void setFamilyaddress(String familyaddress) {
        this.familyaddress = familyaddress;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

