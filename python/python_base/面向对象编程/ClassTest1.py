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