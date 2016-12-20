package Chapter2.SynchronizedBlockLockAll;

/**
 * Created by 49005 on 2016/12/20.
 */
public class Run1_2 {
    public static void main(String[] args){
        Service service=new Service();
        MyObject object1=new MyObject();
        MyObject object2=new MyObject();

        ThreadA a=new ThreadA(service,object1);
        a.setName("A");
        a.start();

        ThreadB b=new ThreadB(service,object2);
        b.setName("B");
        b.start();
    }
}
