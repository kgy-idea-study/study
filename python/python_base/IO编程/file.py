f = open('test.txt','r')
print(f.read())
f.close()

with open('test.txt','r') as f:
	print(f.read())
f.close()

ff = open('test.txt','w')
ff.write('hello,')
ff.write('world')
ff.close()

f2 = open('test.txt','r')
print(f2.read(4))
print(f2.read())
f2.close()