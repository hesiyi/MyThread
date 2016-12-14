package Synchronized_Thread.Synchronized_Thread;

/**
 * Created by 49005 on 2016/12/13.
 */
//同步对addI()方法进行访问,为什么没有不一致问题呢
public class Run_HasS {
    public static void main(String[] args){
        HasSelfPrivateNum hasSelfPrivateNum=new HasSelfPrivateNum();
        ThreadA threadA=new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB=new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }
}
