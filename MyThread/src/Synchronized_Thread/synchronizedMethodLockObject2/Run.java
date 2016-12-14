package Synchronized_Thread.synchronizedMethodLockObject2;

import Synchronized_Thread.synchronizedMethodLockObject.MyObject;
import Synchronized_Thread.synchronizedMethodLockObject.ThreadA;
import Synchronized_Thread.synchronizedMethodLockObject.ThreadB;

/**
 * Created by 49005 on 2016/12/13.
 */
public class Run {
    public static void main(String[] args){

        MyObject myObject=new MyObject();
        ThreadA threadA=new ThreadA(myObject);
        threadA.setName("A");
        ThreadB threadB=new ThreadB(myObject);
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}
