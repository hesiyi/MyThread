package TwoThreadTransData.Wait_Notify_Size5;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Run {
    public static void main(String[] args){
        try{
            Object lock=new Object();
            ThreadA threadA=new ThreadA(lock);
            threadA.start();

            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName());
            ThreadB threadB=new ThreadB(lock);
            threadB.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
