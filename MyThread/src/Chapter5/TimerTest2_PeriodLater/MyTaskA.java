package Chapter5.TimerTest2_PeriodLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by 49005 on 2016/12/28.
 */
public class MyTaskA extends TimerTask{
    @Override
    public void run() {
        try{
            System.out.println("A begin timer="+new Date());
            Thread.sleep(5000);
            System.out.println("A end timer="+new Date());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
