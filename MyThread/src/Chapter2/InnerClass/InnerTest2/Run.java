package Chapter2.InnerClass.InnerTest2;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){
        final OutClass.InnerClass1 in1=new OutClass.InnerClass1();
        final OutClass.InnerClass1.InnerClass2 in2=new OutClass.InnerClass1.InnerClass2();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method1(in2);
            }
        },"T1");

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                in1.method2();
            }
        },"T2");

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                in2.method1();
            }
        },"T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
