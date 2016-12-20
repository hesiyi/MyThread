package Chapter2.SynchronizedBlockLockAll1;

/**
 * Created by 49005 on 2016/12/20.
 */
public class ThreadB extends Thread {
    private MyObject object;
    private Service service;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrinfString();
    }
}
