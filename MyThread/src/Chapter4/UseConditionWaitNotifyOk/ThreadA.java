package Chapter4.UseConditionWaitNotifyOk;

/**
 * Created by 49005 on 2016/12/26.
 */
public class ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
