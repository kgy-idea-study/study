#__metaclass__ = type # 如果你使用的是Python 2，请包含这行代码
class Person:

    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name

    def greet(self):
        print("Hello, world! I'm {}.".format(self.name))




foo = Person()
bar = Person()
foo.set_name("a")
bar.set_name("b")
foo.greet()
bar.greet()

print(foo.__class__)
print(Person.__bases__)


class Calculator:
    def calculate(self, expression):
        self.value = eval(expression)

class Talker:
    def talk(self):
        print('Hi, my value is', self.value)

class TalkingCalculator(Calculator, Talker):
    pass

tc = TalkingCalculator()
tc.calculate('1 + 2 * 3')
tc.talk()

print(hasattr(tc,'talk'))
print(hasattr(tc,'talkd'))

print(callable(getattr(tc,'talk',None)))
print(callable(getattr(tc,'talks',None)))

print(tc.__dict__)


from abc import ABC, abstractmethod
class Talker(ABC):
    @abstractmethod
    def talk(self):
        pass

class Knigget(Talker):
    def talk(self):
        print("Ni!")

k = Knigget()
print(isinstance(k,Talker))
k.talk()

class Herring :
    def talk(self):
        print("Blub.")

h = Herring()
print(isinstance(h,Talker))

Talker.register(Herring)
print(isinstance(h,Talker))
print(issubclass(Herring,Talker))
