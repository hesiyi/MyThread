package Chapter2.AtomicIntegerNoSafe;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){
        try{
            MyService service=new MyService();
            MyThread[] arry=new MyThread[5];
            for (int i = 0; i < arry.length; i++) {
                arry[i]=new MyThread(service);
            }
            for (int i = 0; i < arry.length; i++) {
                arry[i].start();
            }
            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
