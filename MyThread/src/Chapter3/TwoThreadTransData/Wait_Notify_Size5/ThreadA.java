package Chapter3.TwoThreadTransData.Wait_Notify_Size5;

/**
 * Created by 49005 on 2016/12/14.
 */
public class ThreadA extends Thread {
    private Object object;
    public ThreadA(Object object){
        super();
        this.object=object;
    }

    @Override
    public void run() {
        try{
            synchronized (object){
                if(MyList.size()!=5){
                    System.out.println("wait begin "+ System.currentTimeMillis());
                }
                object.wait();
                System.out.println("wait end "+System.currentTimeMillis());
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
