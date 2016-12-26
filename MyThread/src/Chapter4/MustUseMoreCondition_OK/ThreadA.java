package Chapter4.MustUseMoreCondition_OK;

/**
 * Created by 49005 on 2016/12/26.
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
