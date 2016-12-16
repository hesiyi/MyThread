package Chapter2.SynNotExtends;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Test {
    public static void main(String[] args){
        Sub subRef=new Sub();
        MyThreadA myThreadA=new MyThreadA(subRef);
        myThreadA.setName("A");
        myThreadA.start();

        MyThreadB myThreadB=new MyThreadB(subRef);
        myThreadB.setName("B");
        myThreadB.start();
    }
}
