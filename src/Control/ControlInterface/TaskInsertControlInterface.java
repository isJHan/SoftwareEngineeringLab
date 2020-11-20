package Control.ControlInterface;
import Model.Taskbook;

import java.util.List;
import java.util.ArrayList;
public interface TaskInsertControlInterface {
    // 插入任务书，操作数据库
    // 若有错误，返回null
    // 注意，任务书可重新录入，覆盖原来任务书，
    // 在此函数中实现这个功能
    public List<Taskbook> insertTaskbook(List<Taskbook> taskbooks);

}

