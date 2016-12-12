package com.Thread.Run;

import com.Thread.Thread.MyThread0;

/**
 * Created by 49005 on 2016/12/12.
 */
//通过结果来分析，线程具有随机性，cpu执行哪个线程具有不确定性
public class Run0 {
    public static void main(String[] args) {
        try {
            MyThread0 thread0 = new MyThread0();
            thread0.setName("myThread");
            thread0.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
