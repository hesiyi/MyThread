package Chapter4.UseConditionWaitNotifyError.Z3_Ok;

/**
 * Created by 49005 on 2016/12/26.
 */
public class Run {
    public static void main(String[] args){
        MyService myService=new MyService();
        ThreadA threadA=new ThreadA(myService);
        threadA.start();
    }
}
