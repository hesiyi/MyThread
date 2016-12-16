package Chapter2.SynBlockString;

/**
 * Created by 49005 on 2016/12/16.
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("b","bb");
    }
}
