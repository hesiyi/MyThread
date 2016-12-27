ThreadName=Thread-0进入方法！
有线程数：9在等待获取锁！

int getQueueLength()跟作用是返回正在等待获取此锁的线程估计数

比如有5个线程,1个线程首先执行await()方法,那么在调用getqueueLength()方法后返回的值是4,说明有4个线程
同时在等待lock的释放