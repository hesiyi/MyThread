package Chapter1.Stop_Thread.Run;

import Chapter1.Stop_Thread.MyThread.MyThread4;

/**
 * Created by 49005 on 2016/12/9.
 */
public class Run4 {
    public static void main(String[] agrs){
        try {
            MyThread4 myThread4=new MyThread4();
            myThread4.start();
            Thread.sleep(8000);
            //暴力停止
            myThread4.stop();
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
