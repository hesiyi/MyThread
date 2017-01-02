package Chapter3.JoinTest.JoinMoreTest;

/**
 * Created by 49005 on 2017/1/2.
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b=b;
    }
    @Override
    public void run() {
        try {
            synchronized (b) {
                System.out.println("begin A ThreadName=" + Thread.currentThread().getName()+" "+
                System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end A ThreadName=" + Thread.currentThread().getName()+" "+
                        System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
