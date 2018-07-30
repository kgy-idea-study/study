list = [1,2,3,4]
it = iter(list)  # 创建迭代器对象
for x in it :
	print(x , end=" ")

import sys  # 引入 sys 模块

print("")
# list = [1, 2, 3, 4]
# it = iter(list)  # 创建迭代器对象
#
# while True:
# 	try:
# 		print(next(it))
# 	except StopIteration:
# 		sys.exit()


def fibonacci(n):  # 生成器函数 - 斐波那契
	a, b, counter = 0, 1, 0
	while True:
		if (counter > n):
			return
		yield a
		a, b = b, a + b
		counter += 1


f = fibonacci(10)  # f 是一个迭代器，由生成器返回生成

while True:
	try:
		print(next(f), end=" ")
	except StopIteration:
		sys.exit()