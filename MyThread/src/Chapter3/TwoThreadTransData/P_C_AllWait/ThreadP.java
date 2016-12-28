package Chapter3.TwoThreadTransData.P_C_AllWait;

/**
 * Created by 49005 on 2016/12/28.
 */
public class ThreadP extends Thread {
    private P p;
    public ThreadP(P p){
        super();
        this.p=p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
