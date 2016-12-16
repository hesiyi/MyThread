package Chapter2.DirtyRead_Thread;

/**
 * Created by 49005 on 2016/12/14.
 */
public class ThreadA extends Thread{
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar=publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
