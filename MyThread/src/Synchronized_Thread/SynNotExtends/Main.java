package Synchronized_Thread.SynNotExtends;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Main  {
    synchronized public void servieMethod(){
        try{
            System.out.println("int main 下一步 sleep main begin threadName="+Thread.currentThread().getName()+
            " time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步 sleep end threadName="+ Thread.currentThread().getName()+" time="+ System.currentTimeMillis());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
