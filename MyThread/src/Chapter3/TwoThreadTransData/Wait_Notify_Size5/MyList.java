package Chapter3.TwoThreadTransData.Wait_Notify_Size5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyList {
    private static List list=new ArrayList();
    public static void add(){
        list.add("anyString");
    }
    public static int size(){
        return list.size();
    }
}
