package Chapter4.LockMethodTest2.Test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 49005 on 2016/12/27.
 */
public class Service {
    public ReentrantLock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void waitMethod(){
        try{
            lock.lock();
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void notifyMethod(){
        try{
            lock.lock();
            System.out.println("有没有线程正在等待condition?"+lock.hasWaiters(condition)+
            "线程数是多少？"+lock.getWaitQueueLength(condition));
        }finally {
            lock.unlock();
        }
    }
}
