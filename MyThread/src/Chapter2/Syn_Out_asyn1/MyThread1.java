package Chapter2.Syn_Out_asyn1;

/**
 * Created by 49005 on 2016/12/20.
 */
public class MyThread1 extends Thread {
    private MyOneList list;
    public MyThread1(MyOneList list){
        super();
        this.list=list;
    }

    @Override
    public void run() {
        MyService msRef=new MyService();
        msRef.addServiceMethod(list,"A");
    }
}
