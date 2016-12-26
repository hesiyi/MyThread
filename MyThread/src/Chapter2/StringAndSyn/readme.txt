A
A
A
A
A
A
A
String 的两个值都是AA,两个线程持有相同的锁,所以造成线程B不能执行.这就是String常量池所带来的问题.
因此在大多数情况下都不使用String作为锁对象,而用new Object()