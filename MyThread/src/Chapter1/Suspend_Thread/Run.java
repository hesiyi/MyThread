package Chapter1.Suspend_Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run {
    public static void main(String[] args){
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(5000);

            //A段
            myThread.suspend();
            System.out.println("A="+System.currentTimeMillis()+" i="+myThread.getI());
            Thread.sleep(5000);
            System.out.println("A="+System.currentTimeMillis()+" i="+myThread.getI());

            //B段
            myThread.resume();
            Thread.sleep(5000);
            //c段
            myThread.suspend();
            System.out.println("B="+System.currentTimeMillis()+" i="+myThread.getI());

            Thread.sleep(5000);
            System.out.println("B="+System.currentTimeMillis()+" i="+myThread.getI());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
