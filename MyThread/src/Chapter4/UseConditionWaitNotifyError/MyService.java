package Chapter4.UseConditionWaitNotifyError;

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
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
