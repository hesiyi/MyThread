package Chapter2.VolatileTest.t10;

import Chapter2.VolatileTest.PrintString;

/**
 * Created by 49005 on 2016/12/23.
 */
public class Run {
    public static void main(String[] args){
        PrintString printStringService=new PrintString();
        new Thread(String.valueOf(printStringService)).start();
        System.out.println("我要停止它!stopThread="+Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
