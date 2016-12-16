package Chapter6.Singleton_1;

/**
 * Created by 49005 on 2016/12/16.
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){

    }
    public static MyObject getInstance(){
        //延迟加载
        if(myObject!=null){

        }else{
            myObject=new MyObject();
        }
        return myObject;
    }
}
