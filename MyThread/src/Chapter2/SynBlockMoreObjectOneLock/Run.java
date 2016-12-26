package Chapter2.SynBlockMoreObjectOneLock;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();


        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
