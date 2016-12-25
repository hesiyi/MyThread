package Chapter5.TimerTest2_Period;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/25.
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务完成了,时间为："+new Date());
    }
}
