package Stop_Thread.Run;

import Stop_Thread.MyThread.MyThread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run {
    public static  void main(String[] agrs) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            //并没有停止线程，只是打了一个停止的标记
            myThread.interrupt();
            System.out.println("myThread线程是否停止1："+myThread.isInterrupted());
            System.out.println("myThread线程是否停止2："+myThread.isInterrupted());
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
