package Synchronized_Thread.twoObjectTwoLock;

/**
 * Created by 49005 on 2016/12/13.
 */
public class ThreadA_twoObj extends Thread{
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadA_twoObj(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum= hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("a");
    }
}
