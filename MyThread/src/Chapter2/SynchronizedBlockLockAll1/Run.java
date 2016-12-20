package Chapter2.SynchronizedBlockLockAll1;

/**
 * Created by 49005 on 2016/12/20.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        Service service=new Service();
        MyObject object=new MyObject();
        ThreadA a=new ThreadA(object,service);
        a.setName("a");
        a.start();
        Thread.sleep(100);
        ThreadB b=new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
