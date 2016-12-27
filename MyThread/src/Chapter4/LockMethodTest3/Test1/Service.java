package Chapter4.LockMethodTest3.Test1;

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
            System.out.println("公平锁情况："+lock.isFair());
        }finally {
            lock.unlock();
        }
    }
}
