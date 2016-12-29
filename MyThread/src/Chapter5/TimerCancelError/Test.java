package Chapter5.TimerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by 49005 on 2016/12/29.
 */
public class Test {
    public static void main(String[] agrs) throws InterruptedException{
        int i=0;
        Calendar calendarRef1=Calendar.getInstance();
        Date runDate=calendarRef1.getTime();
        while(true){
            i++;
            Timer timer=new Timer();
            MyTaskA task1=new MyTaskA(i);
            timer.schedule(task1,runDate);
            timer.cancel();
        }
    }
}
