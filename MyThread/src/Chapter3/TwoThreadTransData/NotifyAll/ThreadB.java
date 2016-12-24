package Chapter3.TwoThreadTransData.NotifyAll;

/**
 * Created by 49005 on 2016/12/24.
 */
public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        Service service=new Service();
        service.testMethod(lock);
    }
}
