notify()一次只随机的通知一个线程进行唤醒
begin wait() ThreadName=Thread-0
begin wait() ThreadName=Thread-1
begin wait() ThreadName=Thread-2
   end wait() ThreadName=Thread-0
   end wait() ThreadName=Thread-2
   end wait() ThreadName=Thread-1

多次调用notify()方法唤醒了全部的WAITING中的线程