package Chapter2.Synchronized_Thread.Task;

/**
 * Created by 49005 on 2016/12/16.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        Task task=new Task();
        MyThread1 thread1=new MyThread1(task);
        thread1.start();
        Thread.sleep(100);
        MyThread2 thread2=new MyThread2(task);
        thread2.start();
    }
}
