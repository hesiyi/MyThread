package Chapter5.TimerCancleMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/29.
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B run timer="+new Date());
    }
}