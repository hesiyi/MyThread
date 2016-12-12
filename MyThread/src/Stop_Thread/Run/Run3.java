package Stop_Thread.Run;

import Stop_Thread.MyThread.MyThread3;

/**
 * Created by 49005 on 2016/12/9.
 */
public class Run3 {
    public static void main(String[] agrs){
        try {
            MyThread3 myThread3=new MyThread3();
            myThread3.start();
            Thread.sleep(2000);
            //执行了interrupt方法之后，thread并没有停止，而且还会执行
            myThread3.interrupt();
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
