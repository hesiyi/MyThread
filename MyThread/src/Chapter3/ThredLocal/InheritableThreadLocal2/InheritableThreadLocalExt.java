package Chapter3.ThredLocal.InheritableThreadLocal2;

import java.util.Date;

/**
 * Created by 49005 on 2017/1/2.
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+"我在子线程加的~！";
    }
}
