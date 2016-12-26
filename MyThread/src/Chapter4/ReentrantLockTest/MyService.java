package Chapter4.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 49005 on 2016/12/20.
 */
public class MyService  {
    //调用ReentrantLock()对象的lock()方法获取锁
    private Lock lock=new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName="+Thread.currentThread().getName()+(" "+(i+1)));
        }
        //调用unlock()方法释放锁
        lock.unlock();
    }
}
