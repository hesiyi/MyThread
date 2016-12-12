package com.Thread.Run;

import com.Thread.Thread.MyThreadTest;

/**
 * Created by 49005 on 2016/12/9.
 */
public class RunTest {
    public static void main(String[] args){
        MyThreadTest thread=new MyThreadTest();

            //如果多次调用thread就会出现Exception in thread "main" java.lang.IllegalThreadStateException
            thread.start();
            System.out.println("运行结束");
    }
}
