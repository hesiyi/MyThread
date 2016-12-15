package Synchronized_Thread.SynLockIn_2;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub=new Sub();
        sub.operateISubMethod();
    }
}
