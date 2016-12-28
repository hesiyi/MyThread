package Chapter3.TwoThreadTransData.P_C_AllWait;
/**
 * Created by 49005 on 2016/12/28.
 */
public class P {
    private String lock;
    public P(String lock){
        super();
        this.lock=lock;
    }
    public void setValue(){
        try{
            synchronized (lock){
                while(!ValueObject.value.equals("")){
                    System.out.println("生产者"+Thread.currentThread().getName()+"WAITING了*");
                    lock.wait();
                }
                System.out.println("生产者"+Thread.currentThread().getName()+"RUNNAING 了");
                String value=System.currentTimeMillis()+"_"+System.nanoTime();
                ValueObject.value=value;
                lock.notify();
            }
        }catch (InterruptedException e){

        }
    }
}
