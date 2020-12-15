package com.liu.Task1.tool;
import java.sql.*;

public class DBconnect {

    static final String DB_URL="jdbc:mysql://localhost:3306/shoolrool?";
    static final String USER="root";
    static final String PASS="914903";
    static Connection conn=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    static Statement st=null;

    public static void init() throws SQLException, ClassNotFoundException {//SQl程序初始化
        try{
            Class.forName("com.mysql.jdbc.Driver");//注册驱动
            conn= DriverManager.getConnection(DB_URL, USER, PASS);  //建立连接
        }catch (Exception e){
            System.out.println("SQL程序初始化失败");
            e.printStackTrace();
        }
    }

    public static int addUpdateDelete(String sql){
        int i=0;
        try{
            ps=conn.prepareStatement(sql);
            boolean flag= ps.execute();
            if(flag==false){//如果第一个结果是结果集对象，则返回true;如果第一个结果是更新计数或者没有结果，则返回false
                i++;
            }
        }catch(Exception e){
            System.out.println("数据库增删改异常 ");
            e.printStackTrace();
        }
        return i;
    }

    public static ResultSet selectSql(String sql){
        try{
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();

        }catch(Exception e){
            System.out.println("数据库查询异常");
            e.printStackTrace();
        }
        return rs;
    }

    public static  void closeConn(){
        try{
            conn.close();
        }catch(Exception e){
            System.out.println("数据库关闭异常");
            e.printStackTrace();
        }
    }
}
