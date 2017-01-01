package Chapter3.ThredLocal.ThreadLocal22;

/**
 * Created by 49005 on 2017/1/1.
 */
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不在为null";
    }
}
