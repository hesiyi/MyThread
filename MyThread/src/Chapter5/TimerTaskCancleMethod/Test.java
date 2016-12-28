package Chapter5.TimerTaskCancleMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by 49005 on 2016/12/28.
 */
public class Test {
    public static void main(String[] args){
        System.out.println("当前时间为"+new Date());
        Calendar calendarRef=Calendar.getInstance();

        Date runDate1=calendarRef.getTime();
        System.out.println("计划时间为:"+runDate1);
        MyTaskA task1=new MyTaskA();
        MyTaskB task2=new MyTaskB();
        Timer timer=new Timer();
        timer.schedule(task1,runDate1,4000);
        timer.schedule(task2,runDate1,4000);
    }
}
