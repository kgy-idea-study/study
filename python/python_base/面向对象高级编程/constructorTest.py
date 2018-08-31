class FooBar:
    def __init__(self):
        self.somevar = 42

    def __init__(self, value=42):
        self.somevar = value


f = FooBar()
print(f.somevar)

g = FooBar('This is a constructor argument')
print(g.somevar)


class Bird:
    def __init__(self):
        self.hungry = True

    def eat(self):
        if self.hungry:
            print('Aaaah ...')
            self.hungry = False
        else:
            print('No, thanks!')

class SongBird(Bird):
    def __init__(self):
        #Bird.__init__(self)
        super().__init__()
        self.sound = 'Squawk!'
    def sing(self):
        print(self.sound)

sb = SongBird()
sb.sing()
sb.eat()