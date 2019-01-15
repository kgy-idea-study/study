import sys

#for line in sys.stdin:
#    print(line)

f = open('somefile.txt','w')
print('first','ljne',file=f)
print('second','line',file=f)
print('third','ljne',file=f)
f.close()

lines = list(open('somefile.txt'))
print(lines)