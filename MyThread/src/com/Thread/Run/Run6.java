package com.Thread.Run;

import com.Thread.Thread.MyThread6;

/**
 * Created by 49005 on 2016/12/9.
 */
//暴力停止
public class Run6 {
    public static void main(String[] agrs){

        try {
            MyThread6 myThread6 = new MyThread6();
            myThread6.start();
            myThread6.sleep(8000);
            myThread6.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
