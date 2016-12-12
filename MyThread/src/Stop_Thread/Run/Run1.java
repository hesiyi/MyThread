package Stop_Thread.Run;

import Stop_Thread.MyThread.MyThread1;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run1 {
    public static  void main(String[] agrs) {
        try {
            MyThread1 myThread1 = new MyThread1();
            myThread1.start();
            Thread.sleep(2000);
            //并没有停止线程
            myThread1.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
