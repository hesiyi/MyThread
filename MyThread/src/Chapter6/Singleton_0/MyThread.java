package Chapter6.Singleton_0;

/**
 * Created by 49005 on 2016/12/16.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
