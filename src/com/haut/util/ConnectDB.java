package com.haut.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    //连接数据库
    public Connection conn(){
        Connection con=null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bbs?useUnicode=true&characterEncoding=utf-8","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    //关闭数据库连接池
    public void closeDB(){
        try {
            conn().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
