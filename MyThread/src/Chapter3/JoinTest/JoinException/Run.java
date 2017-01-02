package Chapter3.JoinTest.JoinException;

/**
 * Created by 49005 on 2017/1/2.
 */
public class Run {
    public static void main(String[] args){
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);

            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
