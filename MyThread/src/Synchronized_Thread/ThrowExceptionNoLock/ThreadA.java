package Synchronized_Thread.ThrowExceptionNoLock;

/**
 * Created by 49005 on 2016/12/14.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA (Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
