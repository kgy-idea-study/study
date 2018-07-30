"""
list
Python内置的一种数据类型是列表：list。list是一种有序的集合，可以随时添加和删除其中的元素。

tuple
另一种有序列表叫元组：tuple。tuple和list非常类似，但是tuple一旦初始化就不能修改
"""
classmates = ['Michael', 'Bob', 'Tracy']
print(len(classmates))
print(classmates[0])
#print(classmates[4])
print(classmates[-1])

classmates.append('adam')

print(classmates)

classmates.insert(1,'Jack')
print(classmates)

classTuple = ('a','b','c')

L = [
    ['Apple', 'Google', 'Microsoft'],
    ['Java', 'Python', 'Ruby', 'PHP'],
    ['Adam', 'Bart', 'Lisa']
]

# 打印Apple:
print(L[0][0])
# 打印Python:
print(L[1][1])
# 打印Lisa:
print(L[2][2])
