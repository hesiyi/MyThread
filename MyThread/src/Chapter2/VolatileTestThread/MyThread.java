package Chapter2.VolatileTestThread;

/**
 * Created by 49005 on 2016/12/23.
 */
public class MyThread extends Thread {
    volatile public static int count;
    synchronized private static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
