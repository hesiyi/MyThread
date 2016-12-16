package Chapter1.Thread.Thread;

/**
 * Created by 49005 on 2016/12/9.
 */
//在沉睡中停止
public class MyThread6 extends Thread {
    private int i=0;
        @Override
        public void run() {
            super.run();
            try {
                while (true){
                    i++;
                    System.out.println("i="+i);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
}

