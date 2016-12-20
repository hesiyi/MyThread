package Chapter2.Syn_Out_asyn;

/**
 * Created by 49005 on 2016/12/20.
 */
public class MyThreadB extends Thread {
    private MyList myList;
    public MyThreadB(MyList myList){
        super();
        this.myList=myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            myList.add("threadB"+(i+1));
        }
    }
}
