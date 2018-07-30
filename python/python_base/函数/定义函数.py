def my_abs(x):
	if not isinstance(x,(int,float)):
		raise TypeError('bad operand type');
	if x >=0 :
		return x
	else:
		return -x

print(my_abs(-99))

def nop():
	pass
"""
pass语句什么都不做，那有什么用？
实际上pass可以用来作为占位符，
比如现在还没想好怎么写函数的代码，就可以先放一个pass，让代码能运行起来。
"""

#返回多个值
import math

def move(x, y, step, angle=0):
    nx = x + step * math.cos(angle)
    ny = y - step * math.sin(angle)
    return nx, ny

x, y = move(100, 100, 60, math.pi / 6)
print(x, y)

r = move(100, 100, 60, math.pi / 6)
print(r)

