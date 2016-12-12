package Suspend_Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远suspend了!");
            Thread.currentThread().suspend();
    }
        System.out.println("end");
  }
}
