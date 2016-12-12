package Thread_Priority;

/**
 * Created by 49005 on 2016/12/12.
 */
//看谁运行的快,高优先级的运行的快
public class RunAB {
    public static void main(String[] args){
        try {
            ThreadA threadA = new ThreadA();
            threadA.setPriority(Thread.NORM_PRIORITY - 3);
            threadA.start();

            ThreadB threadB = new ThreadB();
            threadB.setPriority(Thread.NORM_PRIORITY + 3);
            threadB.start();

            Thread.sleep(20000);

            threadA.stop();
            threadB.stop();
            System.out.println("a="+threadA.getCount());
            System.out.println("b="+threadB.getCount());
        }catch(InterruptedException e){

        }
    }
}
