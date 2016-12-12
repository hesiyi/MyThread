package com.Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread0 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
