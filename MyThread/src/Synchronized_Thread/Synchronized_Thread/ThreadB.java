package Synchronized_Thread.Synchronized_Thread;

/**
 * Created by 49005 on 2016/12/13.
 */
public class ThreadB extends Thread{
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum= hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("b");
    }
}
