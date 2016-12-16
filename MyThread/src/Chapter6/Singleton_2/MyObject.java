package Chapter6.Singleton_2;

/**
 * Created by 49005 on 2016/12/16.
 */
public class MyObject {
    private static MyObject myObject;
    public MyObject(){

    }
    public static MyObject getInstance(){
        try {
            if (myObject != null) {

            } else {
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return myObject;
    }
}
