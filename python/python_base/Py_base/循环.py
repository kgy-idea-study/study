names = ['Michael', 'Bob', 'Tracy']
for name in names:
    print(name)

sum = 0
for x in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]:
    sum += x
print(sum)

sum = 0
for x in range(101):
    sum = sum + x
print(sum)

sum = 0
n = 99
while n > 0:
    sum = sum + n
    n = n - 2
print(sum)

d = {'x': 1, 'y': 2, 'z': 3}
for key in d:
    print(key, "corresponds to", d[key])

for key, value in d.items():
    print(key, "corresponds to", value)

names = ['anne', 'beth', 'george', 'damon']
ages = [12, 45, 32, 102]

for i in range(len(names)):
    print(names[i], 'is', ages[i], 'years old')

for name, age in zip(names, ages):
    print(name, 'is', age, 'years old')

from math import sqrt

for n in range(99, 0, -1):
    root = sqrt(n)
    print(n)
    if root == int(root):
        print(n)
        break

from math import sqrt

for n in range(99, 81, -1):
    root = sqrt(n)
    print(n)
    print(root)
    print(int(root))
    if root == int(root):
        print(n)
        break
else:
    print("Didn't find it!")


girls = ['alice', 'bernice', 'clarice']
boys = ['chris', 'arnold', 'bob']
letterGirls = {}
for girl in girls:
    letterGirls.setdefault(girl[0], []).append(girl)
    print(letterGirls)

print([b+'+'+g for b in boys for g in letterGirls[b[0]]])