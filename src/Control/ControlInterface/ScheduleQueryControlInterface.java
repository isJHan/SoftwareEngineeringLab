package Control.ControlInterface;

import Model.Schedule;

import java.util.List;

public interface ScheduleQueryControlInterface {
    //查，同教务处各项信息的查找类似
    //这里需要多留意
    //接受的参数是 条件字符串，条件字符串在
    //View生成
    //View可通过控制对用户的接口（图形界面的按钮之类组件）
    //限定用户的查询方式，以便生成对应的 条件字符串
    public List<Schedule> query(String condition);
}
