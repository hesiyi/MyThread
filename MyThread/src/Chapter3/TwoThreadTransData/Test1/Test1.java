package Chapter3.TwoThreadTransData.Test1;

/**
 * Created by 49005 on 2016/12/14.
 */
public class Test1 {
    public static void main(String[] args){
        try {
            String newString=new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
