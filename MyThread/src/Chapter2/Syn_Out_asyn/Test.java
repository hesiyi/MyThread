package Chapter2.Syn_Out_asyn;
/**
 * Created by 49005 on 2016/12/20.
 */
public class Test {
    public static void main(String[] args){
        MyList myList=new MyList();
        MyThreadA a=new MyThreadA(myList);
        a.setName("A");
        a.start();

        MyThreadB b=new MyThreadB(myList);
        b.setName("B");
        b.start();
    }
}
