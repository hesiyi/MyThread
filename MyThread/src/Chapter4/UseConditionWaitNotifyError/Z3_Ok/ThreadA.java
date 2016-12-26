package Chapter4.UseConditionWaitNotifyError.Z3_Ok;

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
        myService.waitMethod();
    }
}
