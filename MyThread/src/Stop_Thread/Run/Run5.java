package Stop_Thread.Run;

import Stop_Thread.MyThread.MyThread5;

/**
 * Created by 49005 on 2016/12/9.
 */
//interrupt()和return合作停止线程
public class Run5 {
    public static void main(String[] agrs){
        try {
            MyThread5 myThread5 = new MyThread5();
            myThread5.start();
            Thread.sleep(1000);
            myThread5.interrupt();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
