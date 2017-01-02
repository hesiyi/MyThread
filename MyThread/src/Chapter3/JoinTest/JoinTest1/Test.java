package Chapter3.JoinTest.JoinTest1;

/**
 * Created by 49005 on 2017/1/2.
 */
public class Test {
    public static void main(String[] args){
        MyThread threadTest=new MyThread();
        threadTest.start();

        System.out.println("我想当threadTest对象执行完毕后我在执行");
        System.out.println("但上面代码中sleep()的值应该写多少呢?");
        System.out.println("答案是：根据不能确定：");
    }
}
