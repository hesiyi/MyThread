package Stop_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThread_Syn extends Thread{
    private SynchronizedObject object;
    public MyThread_Syn(SynchronizedObject object){
        super();
        this.object=object;
    }

    @Override
    public void run() {
        object.printString("b","bb");
    }
}
