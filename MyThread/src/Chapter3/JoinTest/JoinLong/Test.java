package Chapter3.JoinTest.JoinLong;

/**
 * Created by 49005 on 2017/1/2.
 */
public class Test {
    public static void main(String[] args){
        try{
            MyThread threadTest=new MyThread();
            threadTest.start();
            Thread.sleep(2000);
//            threadTest.join(2000);
            System.out.println(" end times="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
