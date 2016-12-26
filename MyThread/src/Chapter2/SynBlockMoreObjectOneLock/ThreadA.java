package Chapter2.SynBlockMoreObjectOneLock;

/**
 * Created by 49005 on 2016/12/23.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run() {
        service.printA();
    }
}
