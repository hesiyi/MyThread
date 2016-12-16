package Chapter2.SynBlockString;

/**
 * Created by 49005 on 2016/12/16.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a","aa");
    }
}
