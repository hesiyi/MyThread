package Synchronized_Thread.synchronizedMethodLockObject2;

/**
 * Created by 49005 on 2016/12/14.
 */
public class ThreadA extends Thread {
    private MyObject1 myObject1;
    public ThreadA(MyObject1 myObject1){
        super();
        this.myObject1 = myObject1;
    }

    @Override
    public void run() {
        super.run();
        myObject1.methodA();
    }
}
