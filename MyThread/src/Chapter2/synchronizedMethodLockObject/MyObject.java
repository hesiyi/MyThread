package Chapter2.synchronizedMethodLockObject;

/**
 * Created by 49005 on 2016/12/13.
 */
public class MyObject {
    public void methodA(){
        try{
            System.out.println("begin methodA threadName="+Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
