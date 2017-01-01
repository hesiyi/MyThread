package Chapter3.ThredLocal.ThreadLocal33;

/**
 * Created by 49005 on 2017/1/1.
 */
public class Run {
    public static void main(String[] agrs){
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("    在main线程中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a=new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
