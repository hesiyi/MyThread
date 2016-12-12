package Thread_Priority;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run_Thread {
    public static void main(String[] args){
        System.out.println("main thread begin priority="+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority="+Thread.currentThread().getPriority());
        MyThread1 myThread1=new MyThread1();
        myThread1.start();
    }
}
