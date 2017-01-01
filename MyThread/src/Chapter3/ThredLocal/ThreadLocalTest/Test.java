package Chapter3.ThredLocal.ThreadLocalTest;

/**
 * Created by 49005 on 2016/12/24.
 */
public class Test {
    public static void main(String[] agrs){
        try{
            ThreadA a=new ThreadA();
            ThreadB b=new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main"+(i+1));
                System.out.println("main get Value="+Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
