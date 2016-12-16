package Chapter1.Suspend_Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread extends Thread {
    private long i=0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while(true){
            i++;
        }
    }
}
