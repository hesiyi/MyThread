package Chapter5.TimerTest2_PeriodLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by 49005 on 2016/12/28.
 */
public class Test1 {
    public static void main(String[] args){
        System.out.println("当前时间为："+new Date());
        Calendar calendarRef=Calendar.getInstance();
        calendarRef.add(Calendar.SECOND,10);
        Date runDate=calendarRef.getTime();

        System.out.println("计划时间为"+runDate);
        MyTaskA task=new MyTaskA();
        Timer timer=new Timer();
        timer.schedule(task,runDate);
    }
}
