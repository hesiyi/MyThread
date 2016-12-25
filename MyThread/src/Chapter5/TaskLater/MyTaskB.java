package Chapter5.TaskLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/25.
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
            System.out.println("B begin timer="+new Date());
            System.out.println("B end timer="+new Date());

    }
}
