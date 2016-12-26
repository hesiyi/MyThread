package Chapter2.TwoStop1;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.start();

        ThreadB b=new ThreadB(service);
        b.start();
    }
}
