package Chapter2.SynchronizedBlockLockAll2;

import Chapter2.SynchronizedBlockLockAll1.MyObject;
import Chapter2.SynchronizedBlockLockAll1.Service;

/**
 * Created by 49005 on 2016/12/20.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        Chapter2.SynchronizedBlockLockAll1.Service service=new Service();
        MyObject object=new MyObject();
        ThreadA a=new ThreadA(object,service);
        a.setName("a");
        a.start();
        Thread.sleep(100);
        ThreadB b=new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
