package Chapter4.ConditionTest;

/**
 * Created by 49005 on 2016/12/27.
 */
public class Test {
    public static void main(String[] args){
        MyService myService=new MyService();
        ThreadA a=new ThreadA(myService);
        a.start();

        ThreadB b=new ThreadB(myService);
        b.start();
    }
}
