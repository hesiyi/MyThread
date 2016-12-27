package Chapter4.ConditionTestManyToMany;

/**
 * Created by 49005 on 2016/12/27.
 */
public class ThreadA extends Thread {
    private MyService myService;
    public ThreadA(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.set();
        }
    }
}
