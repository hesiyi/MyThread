package Chapter2.Synchronized_Thread1;

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
