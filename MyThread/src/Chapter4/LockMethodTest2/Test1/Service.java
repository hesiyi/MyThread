package Chapter4.LockMethodTest2.Test1;

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
            Thread.sleep(Integer.MAX_VALUE);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
