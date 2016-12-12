package Sleep_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("run threadName="+this.currentThread().getName()+" begin="+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+" end="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
