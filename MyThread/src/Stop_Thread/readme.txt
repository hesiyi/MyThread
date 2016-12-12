停止线程有三种方法：
1.异常停止,使用退出标志,使线程正常退出,也就是当run方法完成后线程终止
2.stop() suppend()和resume()一样，都是过期作废的方法，使用它们将会产生不可预料的后果
3.interrupt()方法停止


判断线程是否停止：
this.interrupted() 测试当前线程是否已经中断

this.isInterrupted() :测试线程是否已经中断