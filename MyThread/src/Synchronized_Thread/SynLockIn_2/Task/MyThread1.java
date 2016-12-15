package Synchronized_Thread.SynLockIn_2.Task;

import Synchronized_Thread.SynLockIn_2.CommonUtils.CommonUtils;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyThread1 extends Thread {
    private Task task;
    public MyThread1(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1=System.currentTimeMillis();
    }
}
