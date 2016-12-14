package Synchronized_Thread.Synchronized_Thread1;

/**
 * Created by 49005 on 2016/12/13.
 */
//出现了线程不一致问题
public class HasSelfPrivateNum {
    private int num=0;
    synchronized public void addI(String username){
        try{
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(1000);
            }else{
                num=200;
                System.out.println("b set over");
            }
            System.out.println(username+" num="+num);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
