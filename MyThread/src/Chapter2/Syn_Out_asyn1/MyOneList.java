package Chapter2.Syn_Out_asyn1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 49005 on 2016/12/20.
 */
public class MyOneList {
    private List list=new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    };
    synchronized public int getSize(){
        return list.size();
    };
}
