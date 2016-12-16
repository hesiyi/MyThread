package Chapter1.Thread_Priority;

import java.util.Random;

/**
 * Created by 49005 on 2016/12/12.
 */
public class MyThreadRandom2 extends Thread{
    @Override
    public void run() {
        long beginTime=System.currentTimeMillis();
        long addResult=0;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <50000 ; j++) {
                Random random=new Random();
                random.nextInt();
                addResult=addResult+i;
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("#####thread 1 use time="+(endTime-beginTime));
    }
}
