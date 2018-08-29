from random import choice
x = choice(['Hello, world!', [1, 2, 'e', 'e', 4]])

print(x.count('e'))

def length_message(x):
    print("The length of",repr(x),"is",len(x))

length_message("Fnord")

length_message([1, 2, 3])