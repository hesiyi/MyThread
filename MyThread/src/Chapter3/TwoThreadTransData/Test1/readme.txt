wait()方法是object方法,调用时必须获得对象级别的锁,即只能在同步方法中调用wait()方法,在执行wait()方法之后
,当前线程释放锁,

如果没有调用wait()时没有持有适当的锁,则抛出
Exception in thread "main" java.lang.IllegalMonitorStateException
                         	at java.lang.Object.wait(Native Method)
                         	at java.lang.Object.wait(Object.java:502)
                         	at Chapter3.TwoThreadTransData.Test1.Test1.main(Test1.java:10)
                         	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                         	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
                         	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                         	at java.lang.reflect.Method.invoke(Method.java:498)
                         	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
