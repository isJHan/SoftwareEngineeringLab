package Control.ControlInterface;
import Model.Schedule;

import java.util.List;


public interface ClassControlInterface {
    //自动排课方法
    public List<Schedule> autoArrange();

    //手动调整
    //传入手动排完的课表，返回排完的课表，以便在View层渲染
    //                若存在冲突，不写入数据库，返回空List
    public List<Schedule> manualArrange(List<Schedule> valueSchedules);
}
