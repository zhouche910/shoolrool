package com.liu.Task1.service;

import com.liu.Task1.dao.usersDao;
import com.liu.Task1.pojo.Users;
import com.liu.Task1.tool.DBconnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersService implements usersDao {
    @Override
    public boolean login(String username, String password) {
        boolean flag = false;
        try {
            try{
                DBconnect.init();
            }catch (Exception e){
                e.printStackTrace();
            }
            //注意查询语句中的单引号双引号
            ResultSet rs = DBconnect.selectSql("select id,username,pass_Wrod,userType,use_flag from users where username='" + username + " 'and pass_Wrod='" + password + "';");
            while (rs.next()) {
                if (rs.getString("username").equals(username) && rs.getString("pass_Wrod").equals(password)) {
                    flag = true;
                }
            }
            DBconnect.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public void deleteuser(String username) {

    }

    @Override
    public void updateuser(Users users) {

    }

    @Override
    public List<Users> searchAllUsers() {
        List list =new ArrayList();

        try {
            try{
                DBconnect.init();
            }catch (Exception e){
                e.printStackTrace();
            }
            ResultSet rs = DBconnect.selectSql("select * from users");
            while (rs.next()) {
                int userid = rs.getInt("id");
                String username=rs.getString("username");
                String pass_Wrod=rs.getString("pass_Wrod");
                String userType=rs.getString("userType");
                int use_flag=rs.getInt("use_flag");
                Users users=new Users(userid,username,pass_Wrod,userType,use_flag);
                list.add(users);
            }
            DBconnect.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

    }

    @Override
    public Users searchUsers(String username) {
        Users users =new Users();

        try {
            try{
                DBconnect.init();
            }catch (Exception e){
                e.printStackTrace();
            }
            ResultSet rs = DBconnect.selectSql("select * from users where username= '"+username+"'");
            while (rs.next()) {
                int userid = rs.getInt("id");
                String userName=rs.getString("username");
                String pass_Wrod=rs.getString("pass_Wrod");
                String userType=rs.getString("userType");
                int use_flag=rs.getInt("use_flag");
                users.setId(userid);
                users.setPassWrod(pass_Wrod);
                users.setUseFlag(use_flag);
                users.setUserType(userType);
                users.setUsername(userName);
            }
            DBconnect.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean AddUsers(Users users) {
        return false;
    }
}
