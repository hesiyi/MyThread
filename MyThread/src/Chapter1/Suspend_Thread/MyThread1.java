package Chapter1.Suspend_Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread1 extends Thread {
    private long i=0;
    @Override
    public void run() {
        while(true){
            i++;
            System.out.println(i);
        }
    }
}
