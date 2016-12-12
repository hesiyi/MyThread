package Suspend_Thread;

/**
 * Created by 49005 on 2016/12/12.
 */
//不同步问题
public class Run_Obj {
    public static void main(String[] args) throws  InterruptedException{
        final MyObject myObject=new MyObject();
        Thread thread1=new Thread(){
            @Override
            public void run() {
               myObject.setValue("a","aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);
        Thread thread2=new Thread(){
            @Override
            public void run() {

                myObject.printUsernamePassword();
            }
        };
        thread2.start();
    }
}
