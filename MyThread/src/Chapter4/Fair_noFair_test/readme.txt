*线程Thread-0运行了
ThreadName=Thread-0获得锁定
*线程Thread-1运行了
ThreadName=Thread-1获得锁定
*线程Thread-2运行了
ThreadName=Thread-2获得锁定
*线程Thread-3运行了
ThreadName=Thread-3获得锁定
*线程Thread-4运行了
ThreadName=Thread-4获得锁定
*线程Thread-5运行了
ThreadName=Thread-5获得锁定
*线程Thread-6运行了
ThreadName=Thread-6获得锁定
*线程Thread-7运行了
ThreadName=Thread-7获得锁定
*线程Thread-8运行了
ThreadName=Thread-8获得锁定
*线程Thread-9运行了
ThreadName=Thread-9获得锁定


打印结果基本上是呈有序的状态,这就是公平锁



*线程Thread-1运行了
*线程Thread-0运行了
ThreadName=Thread-1获得锁定
*线程Thread-2运行了
ThreadName=Thread-2获得锁定
ThreadName=Thread-0获得锁定
*线程Thread-3运行了
ThreadName=Thread-3获得锁定
*线程Thread-5运行了
ThreadName=Thread-5获得锁定
*线程Thread-7运行了
ThreadName=Thread-7获得锁定
*线程Thread-9运行了
ThreadName=Thread-9获得锁定
*线程Thread-4运行了
ThreadName=Thread-4获得锁定
*线程Thread-8运行了
ThreadName=Thread-8获得锁定
*线程Thread-6运行了
ThreadName=Thread-6获得锁定

打印结果基本上是呈无序的状态,这就是非公平锁