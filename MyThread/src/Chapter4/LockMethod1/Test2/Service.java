package Chapter4.LockMethod1.Test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 49005 on 2016/12/27.
 */
public class Service {
    public ReentrantLock lock=new ReentrantLock();
    public void serviceMethod1(){
        try{
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"进入方法！");
            Thread.sleep(Integer.MAX_VALUE);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
