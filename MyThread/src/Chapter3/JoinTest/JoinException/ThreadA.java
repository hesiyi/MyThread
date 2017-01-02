package Chapter3.JoinTest.JoinException;

/**
 * Created by 49005 on 2017/1/2.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString=new String();
            Math.random();
        }
    }
}
