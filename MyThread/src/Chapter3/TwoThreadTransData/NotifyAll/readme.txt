notifyAll()一次对所有线程进行唤醒
begin wait() ThreadName=Thread-1
begin wait() ThreadName=Thread-0
begin wait() ThreadName=Thread-2
  end wait() ThreadName=Thread-2
  end wait() ThreadName=Thread-0
  end wait() ThreadName=Thread-1