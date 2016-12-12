package Sleep_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("run threadName="+this.currentThread().getName()+" begin");
            Thread.sleep(1000);
            System.out.println("run threadName="+this.currentThread().getName()+" end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
