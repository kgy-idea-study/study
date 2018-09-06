#import tkinter as tk
from tkinter import *

def clicked():
    print('I was clicked!')

top = Tk()
btn = Button()
btn.pack()
btn['text'] = 'Click me!'
btn['command'] = clicked

for i in range(10):
    Button(text=i).pack()
    
mainloop()