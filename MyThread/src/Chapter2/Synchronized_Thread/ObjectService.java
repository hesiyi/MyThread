package Chapter2.Synchronized_Thread;

/**
 * Created by 49005 on 2016/12/16.
 */
public class ObjectService {
    public void serviceMethodA(){
        try{
            synchronized (this){
                System.out.println("A begin time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end   end="+System.currentTimeMillis());
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time="+System.currentTimeMillis());
            System.out.println("B end  end="+System.currentTimeMillis());
        }
    }
}
