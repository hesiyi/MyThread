package Test;

import com.Thread.MyThread1;

/**
 * Created by 49005 on 2016/12/9.
 */
//
public class Run1 {
    public static void main(String[] args){

        try {
            MyThread1 myThread1=new MyThread1();
            myThread1.start();
            Thread.sleep(2000);
            myThread1.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
