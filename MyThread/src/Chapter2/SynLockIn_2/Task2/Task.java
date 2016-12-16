package Chapter2.SynLockIn_2.Task2;

/**
 * Created by 49005 on 2016/12/16.
 */
public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nostnchroized threadName=" + Thread.currentThread().getName() + "i=" + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchroized threadName="+Thread.currentThread().getName()+"i="+(i+1));
            }
        }
    }
}
