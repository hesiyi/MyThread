package Chapter2.TwoStop;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Service {
    synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean isContinueRun=true;
        while(isContinueRun){
        }
        System.out.println("methodA end");
    }
    synchronized public void methodB(){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
