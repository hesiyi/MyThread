synchronized代码块间的同步性

使用synchronized(this)时请注意的是：当一个线程访问object的一个synchronized(this)
同步代码块时,其他线程对同一个object中所有其他synchronized(this)同步代码块的访问将被阻塞；
这说明synchronized使用的"对象监视器"