package Stop_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/9.
 */
public class MyThread3 extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                for (int i = 0; i < 500000; i++) {
                    if (this.interrupted()) {
                        System.out.println("已经是停止状态了，我要退出了");
                        //通过异常停止线程,跳入到catch()中
                        throw new InterruptedException();
                    }
                    System.out.println("i=" + (i + 1));
                }
                System.out.println("我在for下面");
            }catch (InterruptedException e) {
                System.out.println("进入MyThread3.java类run中的catch了");
                e.printStackTrace();
            }
        }
}

