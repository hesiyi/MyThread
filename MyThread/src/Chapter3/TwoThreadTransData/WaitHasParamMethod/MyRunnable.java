package Chapter3.TwoThreadTransData.WaitHasParamMethod;

/**
 * Created by 49005 on 2016/12/24.
 */
public class MyRunnable {
    static private Object lock=new Object();
    static private Runnable runnable1=new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    System.out.println("wait begin timer="+System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end timer="+System.currentTimeMillis());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };
    public static void main(String[] args){
        Thread t=new Thread(runnable1);
        t.start();
    }
}
