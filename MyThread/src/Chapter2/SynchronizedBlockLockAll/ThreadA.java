package Chapter2.SynchronizedBlockLockAll;

/**
 * Created by 49005 on 2016/12/20.
 */
public class ThreadA extends Thread{
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject myObject) {
        super();
        this.service = service;
        this.object = myObject;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
