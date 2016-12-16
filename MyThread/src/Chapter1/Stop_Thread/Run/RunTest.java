package Chapter1.Stop_Thread.Run;

/**
 * Created by 49005 on 2016/12/12.
 */
public class RunTest {
    public static void main(String[] args){
        Thread.currentThread().interrupt();
        //interrupted()看看当前Thread是否能停止,如果第一个为true,则第二个则清除为false
        System.out.println("是否停止1"+Thread.interrupted());
        System.out.println("是否停止2"+Thread.interrupted());
    }
}
