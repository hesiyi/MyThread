package Synchronized_Thread.twoObjectTwoLock;

/**
 * Created by 49005 on 2016/12/13.
 */
//多个对象多个锁
public class Run_twoObj {
    public static void main(String[] args){
        HasSelfPrivateNum hasSelfPrivateNum=new HasSelfPrivateNum();
        ThreadA_twoObj threadA_twoObj=new ThreadA_twoObj(hasSelfPrivateNum);
        threadA_twoObj.start();
        ThreadB_twoObj threadB_twoObj=new ThreadB_twoObj(hasSelfPrivateNum);
        threadB_twoObj.start();
    }
}
