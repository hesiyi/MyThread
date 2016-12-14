package Synchronized_Thread.Synchronized_Thread1;

/**
 * Created by 49005 on 2016/12/13.
 */
public class ThreadA extends Thread{
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum= hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("a");
    }
}
