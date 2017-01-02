package Chapter3.JoinTest.JoinTest2;

/**
 * Created by 49005 on 2017/1/2.
 */
public class Test {
    public static void main(String[] args){
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想当threadTest对象执行完毕后我在执行");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
