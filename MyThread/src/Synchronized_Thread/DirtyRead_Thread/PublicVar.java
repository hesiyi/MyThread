package Synchronized_Thread.DirtyRead_Thread;

/**
 * Created by 49005 on 2016/12/14.
 */
public class PublicVar {
    public String username="A";
    public String password="AA";
    synchronized public void setValue(String username,String password){
        try{
            this.username=username;
            Thread.sleep(5000);
            System.out.println("setValue method thread name="+Thread.currentThread().getName()
            +" username="+username+" password="+password);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public void getValue(){
        System.out.println("getValue method thread name="+Thread.currentThread().getName()
        +" username="+username+" password="+password);
    }
}
