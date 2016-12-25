package Chapter5.TimerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by 49005 on 2016/12/25.
 */
public class Test2 {
    public static void main(String[] args){
        System.out.println("当前时间为："+new Date());
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);
        Date runDate=calendar.getTime();
        System.out.println("计划时间为："+runDate);

        Calendar calendar1=Calendar.getInstance();
        calendar1.add(Calendar.SECOND,15);

        Date runDate1=calendar.getTime();
        System.out.println("计划时间为："+runDate1);

        MyTask task1=new MyTask();
        MyTask task2=new MyTask();

        Timer timer=new Timer();
        //安排在指定的时间执行指定的任务
        timer.schedule(task1,runDate);
        timer.schedule(task2,runDate1);
    }
}
