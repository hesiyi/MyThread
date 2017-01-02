package Chapter3.JoinTest.JoinLong;

/**
 * Created by 49005 on 2017/1/2.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("begin Timer="+System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
