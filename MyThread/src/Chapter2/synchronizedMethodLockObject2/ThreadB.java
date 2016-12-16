package Chapter2.synchronizedMethodLockObject2;



/**
 * Created by 49005 on 2016/12/13.
 */
public class ThreadB extends Thread {
    private MyObject1 myObject1;

    public ThreadB(MyObject1 myObject1){
        super();
        this.myObject1 = myObject1;
    }
    @Override
    public void run() {
        super.run();
        myObject1.methodB();
    }
}
