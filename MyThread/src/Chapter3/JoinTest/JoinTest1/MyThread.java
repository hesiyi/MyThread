package Chapter3.JoinTest.JoinTest1;

/**
 * Created by 49005 on 2017/1/2.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            int secondValue=(int)(Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
