
没有加synchroinzed关键字之前：异步
begin methodA threadName=A
begin methodA threadName=B
end
end

加了关键字之后：进行同步(排序运行的),只有共享的资源才需要同步化
begin methodA threadName=A
end
begin methodA threadName=B
end

同步、异步的概念


