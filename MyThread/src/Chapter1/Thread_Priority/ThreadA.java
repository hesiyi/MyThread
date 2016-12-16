package Chapter1.Thread_Priority;

/**
 * Created by 49005 on 2016/12/12.
 */
public class ThreadA extends Thread {
    private int count=0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while(true){
            count++;
        }
    }
}
