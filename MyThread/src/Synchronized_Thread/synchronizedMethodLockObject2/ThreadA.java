package Synchronized_Thread.synchronizedMethodLockObject2;

/**
 * Created by 49005 on 2016/12/13.
 */
public class ThreadA extends Thread {
    private MyObject myObject;

    public ThreadA(MyObject myObject){
        super();
        this.myObject=myObject;
    }
    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
