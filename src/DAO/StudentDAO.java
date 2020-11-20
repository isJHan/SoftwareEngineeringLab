package DAO;

import Model.Student;
import DB.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class StudentDAO {
    private String[] tableName = {
            "Student",
            "Teacher"
    };
    //增
    public int insert(Student stu){
        Connection con = null;
        con = new DBUtil().getConnection();
        try{
            //学号
            //姓名
            //学院编号
            //专业编号
            //班级编号
            String sql = "insert into "+ tableName[0] + " values(?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, stu.getSno());
            pstmt.setString(2, stu.getSname());
            pstmt.setString(3, stu.getCollege());
            pstmt.setString(4, stu.getMajor());
            pstmt.setString(5, stu.getClass_());
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
    public int delete(Student stu){
        Connection con = null;
        con = new DBUtil().getConnection();
        try{
            //学号
            //姓名
            //学院编号
            //专业编号
            //班级编号
            String sql = "delete from " + tableName[0] + " where sno = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, stu.getSno());
            pstmt.execute();

        }catch (Exception e){
            System.out.println(e.toString());
            return 0;
        }
        return 1;
    }

    //改
    public int set(Student stu){
        if(new StudentDAO().delete(stu) == 1){
            return new StudentDAO().insert(stu);
        }
        return 0;
    }

    //查
    public List<Student> queryStudent(String condition){
        ArrayList<Student> arraylistOfStu = null;
        Connection con = null;
        con = new DBUtil().getConnection();
        try{
            //学号
            //姓名
            //学院编号
            //专业编号
            //班级编号
            String sql = "select * from " + tableName[0] + " where " + condition;
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.getRow() == 0) return null;
            while(rs.next()){
                arraylistOfStu.add(new Student(
                        rs.getString("sno"),
                        rs.getString("sname"),
                        rs.getString("college"),
                        rs.getString("major"),
                        rs.getString("class")
                ));
            }
        }catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
        return arraylistOfStu;
    }

    public static void main(String[] args){
        //ArrayList<Student> ans = new StudentDAO().queryStudent("")
    }
}


