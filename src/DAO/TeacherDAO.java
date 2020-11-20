package DAO;

import DB.DBUtil;
import Model.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAO { private String[] tableName = {
        "Student",
        "Teacher"
};
    //增
    public int insert(Teacher tea){
        Connection con = null;
        con = new DBUtil().getConnection();
        try{
            //学号
            //姓名
            //学院编号
            String sql = "insert into "+ tableName[1] + " values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, tea.getTno());
            pstmt.setString(2, tea.getTname());
            pstmt.setString(3, tea.getCollege());
            pstmt.execute();
        }catch(Exception e){
            System.out.println(e.toString());
            return 0;
        }finally{
            //con.close();
        }
        return 1;
    }

    //删
    public int delete(Teacher tea){
        Connection con = null;
        con = new DBUtil().getConnection();
        try{
            //学号
            //姓名
            //学院编号
            String sql = "delete from " + tableName[1] + " where tno = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, tea.getTno());
            pstmt.execute();

        }catch (Exception e){
            System.out.println(e.toString());
            return 0;
        }
        return 1;
    }

    //改
    public int set(Teacher tea){
        if(new TeacherDAO().delete(tea) == 1){
            return new TeacherDAO().insert(tea);
        }
        return 0;
    }

    //查
    public List<Teacher> queryTeacher(String condition){
        ArrayList<Teacher> arraylistOfTea = null;
        Connection con = null;
        con = new DBUtil().getConnection();
        try{
            //学号
            //姓名
            //学院编号
            String sql = "select * from " + tableName[1] + " where " + condition;
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.getRow() == 0) return null;
            arraylistOfTea = new ArrayList<>();
            while(rs.next()){
                arraylistOfTea.add(new Teacher(
                        rs.getString("tno"),
                        rs.getString("tname"),
                        rs.getString("college")
                ));
            }
        }catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
        return arraylistOfTea;
    }

    public static void main(String[] args){
        //ArrayList<Teacher> ans = new TeacherDAO().queryTeacher("")
    }
}