package Chapter1.Suspend_Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run_Syn {
    public static void main(String[] args){
        try{
            final SynchronizedObject object=new SynchronizedObject();
            Thread thread1=new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };

            thread1.setName("a");
            thread1.start();
            thread1.sleep(1000);
            Thread thread2=new Thread(){
                @Override
                public void run() {
                    System.out.println("thread2启动了，但进入不了printString()方法！只打印1个begin");
                    System.out.println("因为printString()方法被a线程锁住并且永远suspend暂停了!");
                    object.printString();
                }
            };
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
