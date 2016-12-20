package Chapter2.Syn_Out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 49005 on 2016/12/20.
 */
public class MyList {
    private List list=new ArrayList();
    synchronized public void add(String username){
        System.out.println("Threadname="+Thread.currentThread().getName()
        +"执行了add方法");
        list.add(username);
        System.out.println("Threadname="+Thread.currentThread().getName()
                +"退出了add方法");
    }
    synchronized public int getSize(){
        System.out.println("Threadname="+Thread.currentThread().getName()
                +"执行了getsize方法");
        int sizeValue=list.size();
        System.out.println("Threadname="+Thread.currentThread().getName()
                +"退出了getSize方法!");
        return sizeValue;
    }
}
