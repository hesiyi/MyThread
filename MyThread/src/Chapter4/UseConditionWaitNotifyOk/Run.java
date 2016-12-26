package Chapter4.UseConditionWaitNotifyOk;

/**
 * Created by 49005 on 2016/12/26.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyService myService=new MyService();
        ThreadA threadA=new ThreadA(myService);
        threadA.start();
        Thread.sleep(3000);
        myService.signal();
    }
}
