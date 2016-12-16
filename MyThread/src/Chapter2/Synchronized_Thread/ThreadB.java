package Chapter2.Synchronized_Thread;

/**
 * Created by 49005 on 2016/12/16.
 */
public class ThreadB extends Thread {
    private ObjectService service;
    public ThreadB(ObjectService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodB();
    }
}
