package Chapter1.Thread_Priority;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority="+this.getPriority());
        MyThread2 myThread2=new MyThread2();
        myThread2.start();
    }
}
