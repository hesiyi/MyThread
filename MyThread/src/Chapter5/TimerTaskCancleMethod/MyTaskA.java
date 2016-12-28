package Chapter5.TimerTaskCancleMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/28.
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run timer="+new Date());
        this.cancel();
        System.out.println("A任务自己移除自己");
    }
}
