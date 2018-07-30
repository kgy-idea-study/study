f = open('test.txt','r')
print(f.read())
f.close()

with open('test1.txt','r') as f:
	print(f.read())