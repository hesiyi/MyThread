package Synchronized_Thread.Synchronized_Thread;

/**
 * Created by 49005 on 2016/12/13.
 */
//并没有出现非线程安全的问题出现,这是因为方法内部的变量是私有的特性造成的
public class HasSelfPrivateNum {
     public void addI(String username){
        try{
            int num=0;
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(1000);
            }else{
                num=200;
                System.out.println("b set over");
            }
            System.out.println(username+" num+"+num);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
