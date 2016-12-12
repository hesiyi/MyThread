package Thread_Priority;

/**
 * Created by 49005 on 2016/12/12.
 */
//优先级具有规则性,一般是高优先级大部分先执行完,并不代表高优先级的线程先执行完
public class Run_Random {
    public static void main(String[] args){
        for (int i = 0; i <5 ; i++) {
            MyThreadRandom1 myThreadRandom1=new MyThreadRandom1();
            myThreadRandom1.setPriority(10);
            myThreadRandom1.start();

            MyThreadRandom2 myThreadRandom2=new MyThreadRandom2();
            myThreadRandom2.setPriority(1);
            myThreadRandom2.start();
        }
    }
}
