testMethod1_getLock time=1482237434533run ThreadName=A
testMethod1  releaseLock time=1482237436536run ThreadName=A
testMethod1_getLock time=1482237436536run ThreadName=B
testMethod1  releaseLock time=1482237438538run ThreadName=B

同步的原因是因使用了同一个"对象监视器"

如果使用不同的对象监视器会出现什么结果呢

testMethod1_getLock time=1482237586112run ThreadName=A
testMethod1_getLock time=1482237586112run ThreadName=B
testMethod1  releaseLock time=1482237588121run ThreadName=A
testMethod1  releaseLock time=1482237588121run ThreadName=B