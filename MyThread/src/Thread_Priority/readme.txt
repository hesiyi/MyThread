线程的优先级

总共有1-10个等级,优先级越高的线程得到的CPU资源较多,也就是CPU优先执行优先级较高的线程对象中的任务

可以调用Thread.currentThread().setPriority()


线程的优先级跟代码的执行顺序无关