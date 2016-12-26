methodA begin ThreadName=A time=1482198944513
methodA end ThreadName=A time=1482198949526
methodA begin ThreadName=AA time=1482198949526
methodA end ThreadName=AA time=1482198954537
methodB begin ThreadName=B time=1482198954537
methodB end ThreadName=B time=1482198959544
methodB begin ThreadName=BB time=1482198959544
methodB end ThreadName=BB time=1482198964553


lock.lock()代码的线程就持有了"对象监视器",其他线程只有等待锁被释放时再次被抢
效果和synchronized关键字一样,线程之间执行的顺序是随机的