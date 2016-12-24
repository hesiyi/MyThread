package Chapter3.TwoThreadTransData.P_R_Test;

/**
 * Created by 49005 on 2016/12/24.
 */
public class Run {
    public static void main(String[] args){
        String lock=new String("");
        P p=new P(lock);
        C r=new C(lock);
        ThreadP pThread=new ThreadP(p);
        ThreadC cThread=new ThreadC(r);
        pThread.start();
        cThread.start();
    }
}
