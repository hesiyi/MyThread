package Chapter4.LockMethod1.Test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 49005 on 2016/12/27.
 */
public class Service {
    private ReentrantLock lock=new ReentrantLock();
    public void servieMethod1(){
        try{
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
            servieMethod2();
        }finally {
            lock.unlock();
        }
    }
    public void servieMethod2(){
        try{
//            lock.lock();
            System.out.println("serviceMethod2 getHoldCount="+lock.getHoldCount());
        }finally {
//            lock.unlock();
        }
    }
}
