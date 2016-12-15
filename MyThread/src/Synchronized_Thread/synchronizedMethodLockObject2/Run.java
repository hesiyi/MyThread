package Synchronized_Thread.synchronizedMethodLockObject2;
/**
 * Created by 49005 on 2016/12/13.
 */
public class Run {
    public static void main(String[] args){

        MyObject1 myObject1=new MyObject1();
        ThreadA threadA=new ThreadA(myObject1);
        threadA.setName("A");
        ThreadB threadB=new ThreadB(myObject1);
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}
