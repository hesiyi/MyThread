package Chapter5.TimerTest3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/29.
 */
public class Run {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为："+new Date());
        }
    }

    public static void main(String[] agrs){
        MyTask myTask=new MyTask();
        Timer timer=new Timer();
        System.out.println("当前时间为："+new Date());
        timer.schedule(myTask,7000);
    }
}
