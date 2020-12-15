package com.liu.Task1.pojo;

public class Users {
    /**
     *
     */
    private int id;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String passWrod;

    /**
     *
     */
    private String userType;

    /**
     *
     */
    private Integer useFlag;
    public  Users(){

    }

    public   Users(int id,String username,String passWrod, String userType,int useFlag){
        this.id=id;
        this.passWrod=passWrod;
        this.username=username;
        this.useFlag=useFlag;
        this.userType=userType;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passWrod='" + passWrod + '\'' +
                ", userType='" + userType + '\'' +
                ", useFlag=" + useFlag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWrod() {
        return passWrod;
    }

    public void setPassWrod(String passWrod) {
        this.passWrod = passWrod;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }
}

