package Chapter1.Stop_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/9.
 */
public class MyThread5 extends Thread {
    @Override
    public void run() {
            while (true) {
                if(this.isInterrupted()) {
                    System.out.println("停住了");
                    return;
                }
                System.out.println("timer="+System.currentTimeMillis());
            }
    }
}

