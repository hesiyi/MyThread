package Synchronized_Thread.SynNotExtends;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyThreadA extends Thread {
    private Sub sub;
    public MyThreadA(Sub sub){
        super();
        this.sub=sub;
    }

    @Override
    public void run() {
        sub.servieMethod();
    }
}
