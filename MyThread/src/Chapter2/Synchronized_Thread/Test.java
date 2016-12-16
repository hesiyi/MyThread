package Chapter2.Synchronized_Thread;

/**
 * Created by 49005 on 2016/12/16.
 */
public class Test {
    public static void main(String[] args){
        ObjectService service=new ObjectService();
        ThreadA threadA=new ThreadA(service);
        threadA.setName("a");
        threadA.start();

        ThreadB threadB=new ThreadB(service);
        threadB.setName("b");
        threadB.start();
    }
}
