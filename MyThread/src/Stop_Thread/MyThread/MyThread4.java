package Stop_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/9.
 */
public class MyThread4 extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

