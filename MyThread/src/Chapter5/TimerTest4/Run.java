package Chapter5.TimerTest4;

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
    public static void main(String[] args){
        MyTask myTask=new MyTask();
        Timer timer=new Timer();
        timer.schedule(myTask,3000,5000);
    }
}
