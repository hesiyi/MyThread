package Chapter4.ReentrantLockTest;

/**
 * Created by 49005 on 2016/12/20.
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
