package Chapter1.Stop_Thread.Run;

import Chapter1.Stop_Thread.MyThread.MyThread2;

/**
 * Created by 49005 on 2016/12/9.
 */
public class Run2 {
    public static void main(String[] agrs){
        try {
            MyThread2 myThread2=new MyThread2();
            myThread2.start();
            Thread.sleep(2000);
            //执行了interrupt方法之后，thread并没有停止，而且还会执行
            myThread2.interrupt();
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
