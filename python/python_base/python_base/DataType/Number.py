#!/usr/bin/python3
# -*- coding: UTF-8 -

"""
Number（数字）
Python3 支持 int、float、bool、complex（复数）。
在Python 3里，只有一种整数类型 int，表示为长整型，没有 python2 中的 Long。
像大多数语言一样，数值类型的赋值和计算都是很直观的。
内置的 type() 函数可以用来查询变量所指的对象类型。
"""

a, b, c, d = 20, 5.5, True, 4 + 3j
print(type(a), type(b), type(c), type(d))

a = 111

#del a
print(isinstance(a, int))

"""
isinstance 和 type 的区别在于：
type()不会认为子类是一种父类类型。
isinstance()会认为子类是一种父类类型。
"""
class A:
    pass

class B(A):
    pass

print(isinstance(A(), A)) # returns True
print(type(A()) == A)      # returns True
print(isinstance(B(), A))    # returns True
print(type(B()) == A)        # returns False


print(5 + 4 ) # 加法
print(4.3 - 2) # 减法
print(3 * 7)  # 乘法
print(2 / 4)  # 除法，得到一个浮点数
print(2 // 4) # 除法，得到一个整数
print(17 % 3) # 取余
print(2 ** 5) # 乘方