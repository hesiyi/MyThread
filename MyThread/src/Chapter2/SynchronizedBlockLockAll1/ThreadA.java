package Chapter2.SynchronizedBlockLockAll1;

/**
 * Created by 49005 on 2016/12/20.
 */
public class ThreadA extends Thread {
    private MyObject object;
    private Service service;

    public ThreadA(MyObject object, Service service) {
        super();
        this.object = object;
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
