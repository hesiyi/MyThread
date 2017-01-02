线程B在catch出打印了
java.lang.InterruptedException
	at java.lang.Object.wait(Native Method)
	at java.lang.Thread.join(Thread.java:1249)
	at java.lang.Thread.join(Thread.java:1323)
	at Chapter3.JoinTest.JoinException.ThreadB.run(ThreadB.java:12)


说明join()与interrupt()方法如果彼此遇到 则会出现异常