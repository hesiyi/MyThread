package Chapter2.InnerClass.InnerTest1;

/**
 * Created by 49005 on 2016/12/23.
 */
public class OutClass {
    static class Inner {
        public void method1() {
            synchronized ("其他的锁") {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }

        public synchronized void method2() {
            for (int i = 11; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }

            }
        }
    }
}
