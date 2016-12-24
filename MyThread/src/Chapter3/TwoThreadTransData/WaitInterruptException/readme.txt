begin wait()
java.lang.InterruptedException
出现异常了,因为呈wait状态的线程被interrupt了！
	at java.lang.Object.wait(Native Method)
	at java.lang.Object.wait(Object.java:502)
	at Chapter3.TwoThreadTransData.WaitInterruptException.Service.testMethod(Service.java:11)
	at Chapter3.TwoThreadTransData.WaitInterruptException.ThreadA.run(ThreadA.java:16)

当执行wait()时,调用线程对象的interrupt()会InterruptedException异常