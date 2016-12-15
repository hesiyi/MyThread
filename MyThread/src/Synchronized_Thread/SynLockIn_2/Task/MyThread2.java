package Synchronized_Thread.SynLockIn_2.Task;

import Synchronized_Thread.SynLockIn_2.CommonUtils.CommonUtils;

/**
 * Created by 49005 on 2016/12/14.
 */
public class MyThread2 extends Thread {
    private Task task;
    public MyThread2(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2=System.currentTimeMillis();
    }
}