package Chapter5.TimerTest5;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/30.
 */
public class Test8 {
    static class MyTask extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("begin timer=" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end timer=" + System.currentTimeMillis());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        MyTask task=new MyTask();
        System.out.println("当前时间为："+System.currentTimeMillis());
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(task,3000,2000);
    }
}
