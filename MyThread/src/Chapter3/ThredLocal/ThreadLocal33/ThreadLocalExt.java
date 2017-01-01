package Chapter3.ThredLocal.ThreadLocal33;

import java.util.Date;

/**
 * Created by 49005 on 2017/1/1.
 */
public class ThreadLocalExt extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
