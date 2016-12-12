package com.Thread.Run;

import com.Thread.Thread.MyThread7;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run7 {
    public static void main(String[] agrs) throws InterruptedException{
        MyThread7 myThread7=new MyThread7();
        System.out.println("begin=="+myThread7.isAlive());
        myThread7.start();
        Thread.sleep(1000);
        //在一秒内就已经结束了，所以为false
        System.out.println("end=="+myThread7.isAlive());
    }
}
