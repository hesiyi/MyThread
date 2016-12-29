package Chapter5.TimerCancelError;

import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/29.
 */
public class MyTaskA extends TimerTask {
    private int i=0;
    public MyTaskA(int i){
        super();
        this.i=i;
    }
    @Override
    public void run() {
        System.out.println("第"+i+"次没有被cancel取消");
    }
}
