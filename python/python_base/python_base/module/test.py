# 导入模块
import support

import fibo

import test.test

# 现在可以调用模块里包含的函数了
support.print_func("Runoob")

fibo.fib(1000)

print(fibo.fib2(1000))

fib = fibo.fib
fib(500)

test.test.test()