package Chapter3.ThredLocal.ThreadLocalTest;

/**
 * Created by 49005 on 2016/12/24.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try{
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadB"+(i+1));
                System.out.println("ThreadB get Value="+Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
