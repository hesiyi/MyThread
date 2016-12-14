package TwoThreadTransData;

/**
 * Created by 49005 on 2016/12/14.
 */
public class ThreadB extends Thread {
    private MyList myList;
    public ThreadB(MyList myList){
        super();
        this.myList=myList;
    }

    @Override
    public void run() {
        try{
            while(true){
                if(myList.size()==5){
                    System.out.println("==5了,线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
