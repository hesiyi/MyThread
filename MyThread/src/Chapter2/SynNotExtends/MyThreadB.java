package Chapter2.SynNotExtends;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyThreadB extends Thread{
    private Sub sub;
    public MyThreadB(Sub sub){
        super();
        this.sub=sub;
    }

    @Override
    public void run() {
        sub.servieMethod();
    }
}
