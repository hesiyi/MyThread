package Chapter1.Thread.Run;

import Chapter1.Thread.Thread.MyRunnable;

/**
 * Created by 49005 on 2016/12/12.
 */
public class RRun {
    public static void main(String[] agrs){
        //产生runnable对象
        Runnable runnable=new MyRunnable();
        //传入runnable对象
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}
