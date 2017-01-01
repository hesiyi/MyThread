package Chapter3.ThredLocal.ThreadLocal22;

/**
 * Created by 49005 on 2017/1/1.
 */
public class Run {
    public static ThreadLocalExt t1=new ThreadLocalExt();
    public static void main(String[] args){
        if(t1.get()==null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
