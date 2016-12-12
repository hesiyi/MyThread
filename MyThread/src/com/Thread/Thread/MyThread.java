package com.Thread.Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread extends Thread {
    private int i;
    public  MyThread(int i){
        super();
        this.i=i;
    }
    @Override
    public void run() {
        System.out.println(i);
    }
}