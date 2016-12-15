package Synchronized_Thread.SynLockIn_2;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Main {
    public int i=10;
    synchronized public void operateIMainiMethod(){
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
