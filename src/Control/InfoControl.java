package Control;
import Control.ControlInterface.InfoControlInterface;

import DAO.StudentDAO;
import DAO.TeacherDAO;
import Model.Student;
import Model.Teacher;

import java.util.List;

//资料控制类
public class InfoControl implements InfoControlInterface{
    //增
    public int insertInfo(Student stu){
        return new StudentDAO().insert(stu);
    }
    public int insertInfo(Teacher tea){
        return new TeacherDAO().insert(tea);
    }

    //删
    public int deleteInfo(Student stu){
        return new StudentDAO().delete(stu);
    }
    public int deleteInfo(Teacher tea){
        return new TeacherDAO().delete( tea);
    }

    //改
    public int setInfo(Student stu){
        return new StudentDAO().set(stu);
    }
    public int setInfo(Teacher tea){
        return new TeacherDAO().set(tea);
    }

    //查，
    //这里需要多留意
    //接受的参数是 条件字符串，条件字符串在
    //View生成
    //View可通过控制对用户的接口（图形界面的按钮之类组件）
    //限定用户的查询方式，以便生成对应的 条件字符串
    public List<Student> queryStudent(String condition){
        return new StudentDAO().queryStudent(condition);
    }
    public List<Teacher> queryTeacher(String condition){
        return new TeacherDAO().queryTeacher(condition);
    }
}
