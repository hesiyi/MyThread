package Chapter4.ConditionTestMoreMethod;

/**
 * Created by 49005 on 2016/12/20.
 */
public class ThreadA extends Thread {
    private MyService myService;
    public ThreadA(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.methodA();
    }
}
