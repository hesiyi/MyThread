package Chapter3.TwoThreadTransData.P_C_AllWait;

/**
 * Created by 49005 on 2016/12/28.
 */
public class C {
    private String lock;
    public C(String lock){
        super();
        this.lock=lock;
    }
    public void getValue(){
        try{
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println("消费者"+Thread.currentThread().getName()+" WAITING 了*");
                    lock.wait();
                }
                System.out.println("消费者"+Thread.currentThread().getName()+"RUNNING 了");
                ValueObject.value="";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
