package Chapter5.TimerCancleMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/29.
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run timer="+new Date());
    }
}
