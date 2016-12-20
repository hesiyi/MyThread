package Chapter2.SynchronizedBlockLockAll;

/**
 * Created by 49005 on 2016/12/20.
 */
public class Run1_1 {
    public static void main(String[] args){
        Service service=new Service();
        MyObject object=new MyObject();

        ThreadA a=new ThreadA(service,object);
        a.setName("A");
        a.start();

        ThreadB b=new ThreadB(service,object);
        b.setName("B");
        b.start();
    }
}
