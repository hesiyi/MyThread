package Chapter3.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyList {
    private List list=new ArrayList();
    public void add(){
        list.add("高洪岩");
    }
    public int size(){
        return list.size();
    }
}
