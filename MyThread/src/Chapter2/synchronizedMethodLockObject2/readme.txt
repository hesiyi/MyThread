调用synchroinzed一定是排队运行的

1：当methodA()加上synchroinzed时,threadA和threadB是异步(同时)访问各自的方法

begin methodA threadName=A
begin methodB threadName=B begin time=1481682299524
end endTime=1481682304524
end
2：当methodA()和methodB()都加上synchroinzed时,当threadA获取到锁时,threadB是不能访问的,必须等到threadA结束
才能访问

begin methodA threadName=A
end endTime=1481682724465
begin methodB threadName=B begin time=1481682724465
end

