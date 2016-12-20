package Chapter2.SynchronizedBlockLockAll;

/**
 * Created by 49005 on 2016/12/20.
 */
public class ThreadB extends Thread {
    private Service service;
    private MyObject object;

    public ThreadB(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
