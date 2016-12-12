package com.Thread.Thread;

/**
 * Created by 49005 on 2016/12/9.
 */
//在沉睡中停止
public class MyThread5 extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                for (int i = 0; i < 10000 ; i++) {
                    System.out.println("i="+(i+1));
                }
                System.out.println("run begin");
                Thread.sleep(200000);
            }catch(InterruptedException e){
                System.out.println("先停止，在遇到了sleep!进入catch!");
                e.printStackTrace();
            }
        }
}

