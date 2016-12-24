package Chapter3.TwoThreadTransData.P_R_Test;

/**
 * Created by 49005 on 2016/12/24.
 */
/*
消费者
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
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值是"+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
