package Chapter2.SynBlockString2;

/**
 * Created by 49005 on 2016/12/20.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}
