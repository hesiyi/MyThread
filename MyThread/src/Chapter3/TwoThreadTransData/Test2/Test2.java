package Chapter3.TwoThreadTransData.Test2;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Test2 {
    public static void main(String[] args){
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait 下的代码！");
            }
            System.out.println("syn 下的代码");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
