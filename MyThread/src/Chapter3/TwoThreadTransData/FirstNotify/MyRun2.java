package Chapter3.TwoThreadTransData.FirstNotify;

/**
 * Created by 49005 on 2016/12/24.
 */
public class MyRun2 {
    private String lock=new String("");
    private boolean isFirstRunB=false;
    private Runnable runnableA=new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    while(isFirstRunB==false) {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB=new Runnable() {
        @Override
        public void run() {
            synchronized (lock){

                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB=true;
            }
        }
    };
    public static void main(String[] args) throws InterruptedException {
        MyRun2 run=new MyRun2();
        Thread a=new Thread(run.runnableB);
        a.start();
        Thread.sleep(100);
        Thread b=new Thread(run.runnableA);
        b.start();
    }
}
