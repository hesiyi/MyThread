run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main
run printStringMethod threadName=main


运行的一直在运行,停不下来,原因就是main线程一直在执行while循环,
(解决办法就是使用同步死循环)