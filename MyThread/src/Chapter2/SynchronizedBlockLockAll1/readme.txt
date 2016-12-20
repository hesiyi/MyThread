testMethod  _getLock time=1482238344694run ThreadName=a
testMethod  releaseLock time=1482238349702run ThreadName=a
speedPringString _getLock time=1482238349702run ThreadName=b
----------------
speedPringString releaseLock time=1482238349702run ThreadName=b

当其他线程执行X对象中synchronized同步方法时呈现同步效果