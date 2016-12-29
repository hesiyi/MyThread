package Chapter5.TimerCancleMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by 49005 on 2016/12/29.
 */
public class Test {
    public static void main(String[] args)throws InterruptedException{
        System.out.println("当前时间为："+new Date());
        Calendar calendarRef=Calendar.getInstance();

        Date runDate=calendarRef.getTime();
        System.out.println("计划时间为："+new Date());
        MyTaskA myTaskA=new MyTaskA();
        MyTaskB myTaskB=new MyTaskB();
        Timer timer=new Timer();
        timer.schedule(myTaskA,runDate,2000);
        timer.schedule(myTaskB,runDate,2000);
        Thread.sleep(10000);
        timer.cancel();
    }
}
