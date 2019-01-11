package com.haut.util;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.List;
public class UtilHelper {
        ConnectDB con=new ConnectDB();
        public ResultSet selectDB(String sql, List<Object> list){
        ResultSet rs=null;

        try {
            PreparedStatement pst = con.conn().prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE);
            if (list!=null){
                for (int i=0;i<list.size();i++){
                    pst.setObject(i+1,list.get(i));
                }
            }
            rs=pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

        
    //增删查数据库    
    public int caoZuo(String sql,List<Object> list){
        int num=0;
        PreparedStatement pst= null;
        try {
            pst = con.conn().prepareStatement(sql);
            if (list!=null){
                for (int i=0;i<list.size();i++){
                    pst.setObject(i+1,list.get(i));
                }
            }
            num=pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }


}
