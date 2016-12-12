package Stop_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/9.
 */
public class MyThread2 extends Thread {
        @Override
        public void run() {
            super.run();
            for (int i = 0; i <500000 ; i++) {
                if(this.interrupted()){
                    System.out.println("已经是停止状态了，我要退出了");
                    break;
                }
                System.out.println("i="+(i+1));
            }
            //for下面的语句还是会被执行，证明线程并未被执行
            System.out.println("我被输出，如果此代码是for又继续运行,线程并未停止");
        }
}

