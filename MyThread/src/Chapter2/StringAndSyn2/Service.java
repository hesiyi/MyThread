package Chapter2.StringAndSyn2;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Service {
    public static void print(Object object){
        try{
            synchronized (object){
                while(true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
