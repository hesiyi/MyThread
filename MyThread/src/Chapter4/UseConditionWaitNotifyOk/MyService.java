package Chapter4.UseConditionWaitNotifyOk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 49005 on 2016/12/26.
 */
public class MyService {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void await(){
        try{
            lock.lock();
            System.out.println("await时间为："+System.currentTimeMillis());
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal(){
        try{
            lock.lock();
            System.out.println("signal 时间为"+System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
