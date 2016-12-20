package Chapter2.SynchronizedBlockLockAll1;

/**
 * Created by 49005 on 2016/12/20.
 */
public class MyObject {
    synchronized public void speedPrinfString(){
        System.out.println("speedPringString _getLock time="+System.currentTimeMillis()+
        "run ThreadName="+Thread.currentThread().getName());
        System.out.println("----------------");
        System.out.println("speedPringString releaseLock time="+System.currentTimeMillis()+
                "run ThreadName="+Thread.currentThread().getName());
    }
}
