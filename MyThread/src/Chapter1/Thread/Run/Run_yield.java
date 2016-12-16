package Chapter1.Thread.Run;

import Chapter1.Thread.Thread.MyThread_yield;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run_yield {
    public static void main(String[] args){
        MyThread_yield myThread_yield=new MyThread_yield();
        myThread_yield.start();
    }
}
