package Synchronized_Thread.SynNotExtends;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Sub extends Main {
    @Override
    public  void servieMethod() {
        try{
            System.out.println("int sub 下一步 sleep begin threadName="+Thread.currentThread().getName()
            +" time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadname="+Thread.currentThread().getName()
            +" time="+System.currentTimeMillis());
            super.servieMethod();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
