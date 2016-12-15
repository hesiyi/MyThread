sub print i=9
main print i=8
sub print i=7
main print i=6
sub print i=5
main print i=4
sub print i=3
main print i=2
sub print i=1
main print i=0

证明：当存在父子类继承关系时,子类是完全可以通过"可重入锁"调用父类的同步方法的