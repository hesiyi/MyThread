package Chapter2.SynLockIn_1;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Service service=new Service();
        service.service1();
    }
}
