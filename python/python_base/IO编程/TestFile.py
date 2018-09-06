#!/usr/bin/python3
# -*- coding: UTF-8 -

f = open(r'C:\Users\Admin\Desktop\temp.txt','r',encoding='UTF-8')
#print(f.read(7))
#print(f.read())
for i in range(3):
    print(str(i) + ': ' + f.readline(),end="")


f.close()

import sys
for line in sys.stdin:
    print(line)