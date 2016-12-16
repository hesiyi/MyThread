package Chapter2.Synchronized_Thread;

/**
 * Created by 49005 on 2016/12/16.
 */
public class ThreadA extends Thread {
    private ObjectService service;
    public ThreadA(ObjectService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}
