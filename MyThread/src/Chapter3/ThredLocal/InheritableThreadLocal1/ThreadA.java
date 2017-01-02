package Chapter3.ThredLocal.InheritableThreadLocal1;

/**
 * Created by 49005 on 2017/1/2.
 */
public class ThreadA extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
