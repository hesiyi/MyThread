package Chapter2.VolatileTestThread;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){
        MyThread[] myThreads=new MyThread[100];
        for (int i = 0; i <100; i++) {
            myThreads[i]=new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
