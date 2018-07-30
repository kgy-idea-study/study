#!/usr/bin/python3
# -*- coding: UTF-8 -

# 第一个注释
print("Hello, Python!")# 第二个注释

#多行注释
'''
第三注释
第四注释
'''

"""
第五注释
第六注释
"""

#行与缩进
if True:
    print("True")
else:
    print("False")


#多行语句
total = 'item_one' + \
        'item_two' + \
        'item_three'

total = ['item_one', 'item_two', 'item_three',
        'item_four', 'item_five']

word = '字符串'
sentence = "这是一个句子。"
paragraph = """这是一个段落，
可以由多行组成"""


str='Runoob'

print(str)                 # 输出字符串
print(str[0:-1])           # 输出第一个到倒数第二个的所有字符
print(str[0])              # 输出字符串第一个字符

print(str[2:5])            # 输出从第三个开始到第五个的字符
print(str[2:])             # 输出从第三个开始的后的所有字符
print(str * 2)             # 输出字符串两次
print(str + '你好')        # 连接字符串

print('------------------------------')

print('hello\nrunoob')      # 使用反斜杠(\)+n转义特殊字符
print(r'hello\nrunoob')     # 在字符串前面添加一个 r，表示原始字符串，不会发生转义

#Python可以在同一行中使用多条语句，语句之间使用分号(;)分割，以下是一个简单的实例：
import sys; x = 'runoob'; sys.stdout.write(x + '\n')


x="a"
y="b"
# 换行输出
print(x)
print(y)

print('---------')
# 不换行输出
print(x, end=" ")
print(y, end=" ")
print()


print('================Python import mode==========================');
print('命令行参数为:')
for i in sys.argv:
    print(i)
print('\n python 路径为',sys.path)


input("\n\n按下 enter 键后退出。")

