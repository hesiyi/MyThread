package Stop_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i="+(i+1));
        }
    }
}
