package Sleep_Thread.Run;

import Sleep_Thread.MyThread.MyThread1;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run1 {
    public static void main(String[] agrs){
        MyThread1 myThread1=new MyThread1();
        System.out.println("begin="+System.currentTimeMillis());
        myThread1.run();
        System.out.println("end="+System.currentTimeMillis());
    }
}
