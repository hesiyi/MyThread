package Chapter1.Thread.Thread;

/**
 * Created by 49005 on 2016/12/9.
 */
public class MyThread1 extends Thread {
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
    }
}
