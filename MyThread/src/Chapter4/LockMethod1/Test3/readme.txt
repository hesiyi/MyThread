有10个线程正在等待condition


int getWaitQueueLength(Condition condition)的作用是返回等待比此锁定相关的给定条件
Condition的线程估计数


比如有5个线程,每个线程都执行了同一个await()方法,则调用getWaitQueueLength(Condition condition)
方法的返回值是5