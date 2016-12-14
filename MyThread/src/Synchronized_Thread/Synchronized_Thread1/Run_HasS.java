package Synchronized_Thread.Synchronized_Thread1;

/**
 * Created by 49005 on 2016/12/13.
 */
public class Run_HasS {
    public static void main(String[] args){
        HasSelfPrivateNum hasSelfPrivateNum=new HasSelfPrivateNum();
        ThreadA threadA=new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB=new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }
}
