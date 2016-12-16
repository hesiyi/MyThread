package Chapter6.Singleton_0;

/**
 * Created by 49005 on 2016/12/16.
 */
public class MyObject {
    private static MyObject myObject=new MyObject();
    public MyObject(){

    }
    public static MyObject getInstance(){
        //此代码版本为立即加载
        //此版本代码的缺点是不能有其他实例变量
        //因为getInstance()方法没有同步，所以出现非线程安全问题
        return myObject;
    }
}
