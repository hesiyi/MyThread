package Chapter3.JoinTest.JoinSleep2;

/**
 * Created by 49005 on 2017/1/2.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB){
        super();
        this.threadB=threadB;
    }
    @Override
    public void run() {
        threadB.bService();
    }
}
