package Chapter4.LockMethodTest3.Test1;



/**
 * Created by 49005 on 2016/12/27.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        final Service service=new Service(true);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        final Service service2=new Service(false);
        runnable=new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };
        thread=new Thread(runnable);
        thread.start();
    }
}
