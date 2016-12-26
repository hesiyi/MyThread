package Chapter2.VolatileTest.t10;
/**
 * Created by 49005 on 2016/12/23.
 */
public class PrintString implements Runnable{
    private boolean isContinuePrint=true;
    public boolean isContinuePrint(){
        return isContinuePrint;
    }
    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint=isContinuePrint;
    }
    public void printStringMethod(){
        try{
            while(isContinuePrint==true){
                System.out.println("run printStringMethod threadName="+
                        Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
