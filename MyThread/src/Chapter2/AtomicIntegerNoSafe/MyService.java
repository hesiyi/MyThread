package Chapter2.AtomicIntegerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by 49005 on 2016/12/23.
 */
public class MyService {
    public static AtomicLong aiRef=new AtomicLong();
    public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+aiRef.addAndGet(100));
    }
}
