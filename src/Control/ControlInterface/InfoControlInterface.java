package Control.ControlInterface;

import Model.Student;
import Model.Teacher;

import java.util.List;

public interface InfoControlInterface {

    //增
    public int insertInfo(Student stu);
    public int insertInfo(Teacher tea);

    //删
    public int deleteInfo(Student stu);
    public int deleteInfo(Teacher tea);

    //改
    public int setInfo(Student stu);
    public int setInfo(Teacher tea);

    //查，
    //这里需要多留意
    //接受的参数是 条件字符串，条件字符串在
    //View生成
    //View可通过控制对用户的接口（图形界面的按钮之类组件）
    //限定用户的查询方式，以便生成对应的 条件字符串
    public List<Student> queryStudent(String condition);
    public List<Teacher> queryTeacher(String condition);
}
