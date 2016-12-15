package Synchronized_Thread.SynLockIn_2;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Sub extends Main {
    synchronized public  void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainiMethod();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
