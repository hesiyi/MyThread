package Chapter2.SynTwoLock;

/**
 * Created by 49005 on 2016/12/23.
 */
public class ThreadC extends Thread{
    private Service service;

    public ThreadC(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
