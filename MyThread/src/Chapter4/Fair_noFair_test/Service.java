package Chapter4.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 49005 on 2016/12/27.
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock=new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁定");
        }finally {
            lock.unlock();
        }
    }
}
