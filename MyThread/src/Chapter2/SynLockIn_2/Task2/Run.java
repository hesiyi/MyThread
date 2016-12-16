package Chapter2.SynLockIn_2.Task2;

/**
 * Created by 49005 on 2016/12/16.
 */
public class Run {
    public static void main(String[] args){
        Task task=new Task();
        MyThread1 t1=new MyThread1(task);
        MyThread2 t2=new MyThread2(task);
        t1.start();
        t2.start();
    }
}
