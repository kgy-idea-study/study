def fib(max):
	n, a, b = 0, 0, 1
	while n < max:
		yield b
		a, b = b, a + b
		n = n + 1
	return 'done'


g = fib(6)
while True:
	try:
		x = next(g)
		print('g:', x)
	except StopIteration as e:
		print('Generator return value:', e.value)
		break


#python.杨辉三角.生成器
def triangles():
    N=[1]
    while True:
        yield N
        N.append(0)
        N=[N[i-1] + N[i] for i in range(len(N))]
n=0
for t in triangles():
    print(t)
    n=n+1
    if n == 10:
        break




def flatten(nested):
	for sublist in nested:
		for element in sublist:
			yield element

nested = [[1, 2], [3, 4], [5]]
for num in flatten(nested):
	print(num)

def flatten1(nested):
	try:
		#不迭代类似于字符串的对象
		try: nested + ''
		except TypeError: pass
		else: raise TypeError
		for sublist in nested:
			for element in flatten1(sublist):
				yield element
	except TypeError:
		print(33333)
		print(nested)
		yield nested

print(list(flatten1(['foo', ['bar', ['baz']]])))

def repeater(value):
	while True:
		new = (yield value)
		if new is not None :
			value = new

r = repeater(42)
print(next(r))
print(next(r))

r.send("Hello, world!")
print(next(r))