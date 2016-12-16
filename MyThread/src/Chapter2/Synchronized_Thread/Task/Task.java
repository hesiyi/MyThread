package Chapter2.Synchronized_Thread.Task;

/**
 * Created by 49005 on 2016/12/16.
 */
public class Task {
    synchronized public void otherMethod(){
        System.out.println("--------------------run--otherMethod");
    }
    public void doLongTimeTask(){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()
                +" i="+(i+1));
            }
        }
    }
}
