package Chapter1.Stop_Thread.MyThread;

/**
 * Created by 49005 on 2016/12/12.
 */
public class SynchronizedObject {
    private String username="a";
    private String password="aa";

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    synchronized public void printString(String username,String password){
        try{
            this.username=username;
            Thread.sleep(1000);
            this.password=password;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
