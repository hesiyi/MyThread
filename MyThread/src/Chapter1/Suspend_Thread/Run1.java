package Chapter1.Suspend_Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run1 {
    public static void main(String[] args){
        try {
            MyThread1 myThread1 = new MyThread1();
            myThread1.start();
            Thread.sleep(1000);
            myThread1.suspend();
            System.out.println("main end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
