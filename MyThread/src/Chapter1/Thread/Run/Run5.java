package Chapter1.Thread.Run;

import Chapter1.Thread.Thread.MyThread5;

/**
 * Created by 49005 on 2016/12/9.
 */
public class Run5 {
    public static void main(String[] agrs){

        MyThread5 myThread5=new MyThread5();
        myThread5.start();
        myThread5.interrupt();
        System.out.println("end");
    }
}
