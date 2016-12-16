package Chapter1.Thread.Run;

import Chapter1.Thread.Thread.MyThread4;

/**
 * Created by 49005 on 2016/12/9.
 */
public class Run4 {
    public static void main(String[] agrs){
        try {
            MyThread4 myThread4=new MyThread4();
            myThread4.start();
            Thread.sleep(200);
            //执行了interrupt方法之后，thread并没有停止，而且还会执行
            myThread4.interrupt();
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
