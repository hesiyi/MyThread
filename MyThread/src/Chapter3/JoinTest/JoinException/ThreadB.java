package Chapter3.JoinTest.JoinException;

/**
 * Created by 49005 on 2017/1/2.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try{
            ThreadA a=new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end出打印了");
        }catch (InterruptedException e){
            System.out.println("线程B在catch出打印了");
            e.printStackTrace();
        }
    }
}
