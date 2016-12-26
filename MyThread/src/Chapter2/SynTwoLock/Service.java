package Chapter2.SynTwoLock;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Service {
    synchronized public static void printA(){
        try{
            System.out.println("线程名称为："+Thread.currentThread().getName()
                    +"在"+System.currentTimeMillis()+"进入printfA");
            Thread.sleep(3000);
            System.out.println("线程名称为："+Thread.currentThread().getName()
                    +"在"+System.currentTimeMillis()+"离开printfA");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized public static void printB(){
        System.out.println("线程名称为："+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"进入printfB");
        System.out.println("线程名称为："+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"离开printfB");
    }
    synchronized public  void printC(){
        System.out.println("线程名称为："+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"进入printfC");
        System.out.println("线程名称为："+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"离开printfC");
    }

}
