package Chapter2.SynLockIn_2.Task2;

/**
 * Created by 49005 on 2016/12/16.
 */
public class MyThread1 extends Thread {
    private Task task;
    public MyThread1(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
