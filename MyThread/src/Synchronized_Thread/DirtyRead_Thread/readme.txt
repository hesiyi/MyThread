getValue method thread name=main username=B password=AA
setValue method thread name=Thread-0 username=B password=BB


虽然赋值已经同步了,但是取值时有可能出现一些意想不到的意外,这种情况就是脏读
