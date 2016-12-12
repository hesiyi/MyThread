package Thread_Priority;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority="+this.getPriority());
    }
}
