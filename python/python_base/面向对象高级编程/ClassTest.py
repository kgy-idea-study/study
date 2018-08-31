class MyClass:
    @staticmethod
    def smeth():
        print('This is a static method')

    @classmethod
    def cmeth(cls):
        print('This is a class method of', cls)

MyClass.smeth()
MyClass.cmeth()

class Rectangle:
    def __init__(self):
        self.width = 0
        self.height = 0
    def __setattr__(self, key, value):
        if key == 'size':
            self.width,self.height = value
        else:
            self.__dict__[key] = value
    def __getattr__(self, item):
        if item == 'size':
            return self.width,self.height
        else:
            raise AttributeError()

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

