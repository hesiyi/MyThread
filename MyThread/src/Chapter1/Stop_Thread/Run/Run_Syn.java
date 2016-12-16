package Chapter1.Stop_Thread.Run;

import Chapter1.Stop_Thread.MyThread.MyThread_Syn;
import Chapter1.Stop_Thread.MyThread.SynchronizedObject;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run_Syn {
    public static void main(String[] args){
        try {
            SynchronizedObject synchronizedObject = new SynchronizedObject();
            MyThread_Syn myThread_syn = new MyThread_Syn(synchronizedObject);
            myThread_syn.start();
            Thread.sleep(500);
            myThread_syn.stop();
            System.out.println(synchronizedObject.getPassword() +" "+ synchronizedObject.getUsername());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
