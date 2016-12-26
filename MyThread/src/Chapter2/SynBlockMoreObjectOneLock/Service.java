package Chapter2.SynBlockMoreObjectOneLock;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Service {
    public static void printA(){
        synchronized (Service.class) {
            try {
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "进入printfA");
                Thread.sleep(3000);
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "离开printfA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void printB() {
        synchronized (Service.class) {
            System.out.println("线程名称为：" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "进入printfB");
            System.out.println("线程名称为：" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "离开printfB");
        }
    }

}
