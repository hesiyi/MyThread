package Chapter3.JoinTest.JoinSleep;

/**
 * Created by 49005 on 2017/1/2.
 */
public class ThreadA extends Thread {
    private ThreadB threadB;
    public ThreadA(ThreadB threadB){
        super();
        this.threadB=threadB;
    }
    @Override
    public void run() {
        try{
            synchronized (threadB){
                threadB.start();
                Thread.sleep(6000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
