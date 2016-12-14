package TwoThreadTransData.Test2;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyThread2 extends Thread {
    private Object lock;
    public MyThread2(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            System.out.println("开始 notify time="+System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time="+System.currentTimeMillis());
        }
    }
}
