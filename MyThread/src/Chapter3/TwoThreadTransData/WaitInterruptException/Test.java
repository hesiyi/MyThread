package Chapter3.TwoThreadTransData.WaitInterruptException;

/**
 * Created by 49005 on 2016/12/24.
 */
public class Test {
    public static void main(String[] agrs){
        try{
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
