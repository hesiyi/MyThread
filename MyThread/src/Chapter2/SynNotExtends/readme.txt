int sub 下一步 sleep begin threadName=A time=1481687954434
int sub 下一步 sleep begin threadName=B time=1481687954435
int sub 下一步 sleep end threadname=A time=1481687959441
int sub 下一步 sleep end threadname=B time=1481687959441
int main 下一步 sleep main begin threadName=A time=1481687959441
int main 下一步 sleep end threadName=A time=1481687964452
int main 下一步 sleep main begin threadName=B time=1481687964452
int main 下一步 sleep end threadName=B time=1481687969464


同步是不能继承的

所以还得在子类方法中添加synchronized关键字