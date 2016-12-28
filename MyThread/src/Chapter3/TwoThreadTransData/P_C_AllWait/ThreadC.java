package Chapter3.TwoThreadTransData.P_C_AllWait;

/**
 * Created by 49005 on 2016/12/28.
 */
public class ThreadC extends Thread {
    private C r;
    public ThreadC(C r){
        super();
        this.r=r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }
}
