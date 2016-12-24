package Chapter3.TwoThreadTransData.WaitInterruptException;

/**
 * Created by 49005 on 2016/12/24.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                System.out.println(" end wait()");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("出现异常了,因为呈wait状态的线程被interrupt了！");
        }
    }
}
