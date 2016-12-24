(1)正常的结果
begin wait
begin notify
end notify
end wait
(2)如果先执行了notify,方法wait永远不会被通知
begin notify
end notify
begin wait

(3)如果先运行B,那wait就不需要运行了
begin notify
end notify