package com.Thread.Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread7 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("run=="+this.isAlive());
    }
}
