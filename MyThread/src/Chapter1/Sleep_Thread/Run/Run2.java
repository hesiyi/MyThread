package Chapter1.Sleep_Thread.Run;

import Chapter1.Sleep_Thread.MyThread.MyThread2;

/**
 * Created by 49005 on 2016/12/12.
 */
public class Run2 {
    public static void main(String[] agrs) throws InterruptedException{
        MyThread2 myThread2=new MyThread2();
        System.out.println("begin="+System.currentTimeMillis());
        //main（）和start（）是异步执行
        myThread2.start();
        System.out.println("当前线程的名字："+Thread.currentThread().getName());
        //让main线程休眠1秒,run()方法还是执行
        Thread.sleep(10000);
        System.out.println("end="+System.currentTimeMillis());
        //getid方法
//        System.out.println(myThread2.getName()+" "+myThread2.getId());
    }
}
