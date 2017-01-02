package Chapter3.JoinTest.JoinMoreTest;

/**
 * Created by 49005 on 2017/1/2.
 */
public class Run1 {
    public static void main(String[] args){
        try{
            ThreadB b=new ThreadB();
            ThreadA a=new ThreadA(b);
            a.start();
            b.start();
            b.join();
            System.out.println("    main end"+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
