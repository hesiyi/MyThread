package Chapter2.SynBlockString;

/**
 * Created by 49005 on 2016/12/16.
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
    private String anyString=new String();

    public void setUsernamePassword(String username,String password){
        try{
            synchronized (anyString){
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()
                +"进入同步快");

                usernameParam=username;
                Thread.sleep(3000);
                passwordParam=password;
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()
                        +"离开同步快");

            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
