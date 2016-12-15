package Synchronized_Thread.DirtyRead_Thread;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Run {
    public static void main(String[] args){
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();

            Thread.sleep(200);
            publicVar.getValue();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
