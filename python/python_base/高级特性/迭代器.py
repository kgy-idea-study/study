class Fibs:
    def __init__(self):
        self.a = 0
        self.b = 1
    def __next__(self):
        self.a,self.b = self.b,self.a + self.b
        return self.a
    def __iter__(self):
        return self

fibs = Fibs()

for f in fibs:
    if f > 1000:
        print(f)
        break

class TestIterator:
    value = 0
    def __next__(self):
        self.value += 1
        if self.value > 10 : raise StopIteration
        return self.value
    def __iter__(self):
        return self


ti = TestIterator()
print(list(ti))
print(TestIterator.value)
print(ti.value)

def flatten(nested):
    for sublist in nested:
        for element in sublist:
            yield element

nested = [[1, 2], [3, 4], [5]]
for num in flatten(nested):
    print(num)

g = ((i + 2) ** 2 for i in range(2,27))

print(next(g))
print(list(g))

g = [(i + 2) ** 2 for i in range(2,27)]
print(g)

print(sum(i ** 2 for i in range(10)))