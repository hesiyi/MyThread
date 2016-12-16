package Chapter2.twoObjectTwoLock;

/**
 * Created by 49005 on 2016/12/13.
 */
public class ThreadB_twoObj extends Thread{
    private HasSelfPrivateNum hasSelfPrivateNum;
    public ThreadB_twoObj(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum= hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addI("b");
    }
}
