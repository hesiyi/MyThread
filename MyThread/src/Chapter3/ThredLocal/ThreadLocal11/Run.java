package Chapter3.ThredLocal.ThreadLocal11;

/**
 * Created by 49005 on 2016/12/24.
 */
public class Run {
    public static ThreadLocal t1=new ThreadLocal();
    public static void main(String[] args){
        if(t1.get()==null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
