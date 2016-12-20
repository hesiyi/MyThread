package Chapter2.SynchronizedBlockLockAll2;

import Chapter2.SynchronizedBlockLockAll1.*;
import Chapter2.SynchronizedBlockLockAll1.MyObject;

/**
 * Created by 49005 on 2016/12/20.
 */
public class Service {
    public void testMethod1(MyObject object){
        synchronized (object){
            try{
                System.out.println("testMethod  _getLock time="+System.currentTimeMillis()
                +"run ThreadName="+Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod  releaseLock time="+System.currentTimeMillis()
                        +"run ThreadName="+Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
