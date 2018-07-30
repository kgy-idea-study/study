L = ['Michael', 'Sarah', 'Tracy', 'Bob', 'Jack']
print(L[0:3])
print(L[:3])
print(L[1:3])
print(L[-2:])

l = list(range(100))
print(l[:10])
print(l[-10:])
print(l[:10:2])
print(l[::5])


def trim(s):  # 实现strip 忽略前后空格功能
	count = 0
	l = []  # 用于记录非‘ ’的位置
	for i in s:
		count += 1
		if i != ' ':
			l.append(count)
	if l:
		s = s[(l[0] - 1):l[-1]]
	else:
		s = ''
	return s

print(trim('  a  '))