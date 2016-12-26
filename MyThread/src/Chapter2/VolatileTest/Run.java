package Chapter2.VolatileTest;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){
        PrintString printStringService=new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它!stopThread="+Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
