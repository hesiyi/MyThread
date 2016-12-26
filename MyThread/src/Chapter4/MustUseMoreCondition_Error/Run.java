package Chapter4.MustUseMoreCondition_Error;

/**
 * Created by 49005 on 2016/12/26.
 */
public class Run {
    public static void main(String[] args)throws InterruptedException{
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll();
    }
}
