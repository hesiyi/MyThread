package Chapter4.MustUseMoreCondition_Error;

/**
 * Created by 49005 on 2016/12/26.
 */
public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService service){
        super();
        this.service=service;
    }
    @Override
    public void run() {
        service.awaitB();
    }
}
