package Chapter2.StringAndSyn2;

/**
 * Created by 49005 on 2016/12/23.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}
