# 打开一个文件
f = open("e:/foo.txt", "a+")

f.write( "Python 是一个非常好的语言。\n是的，的确非常好!!\n" )

# 关闭打开的文件
f.close()

f = open("e:/foo.txt", "r+")
str = f.read()
print(str)
f.close()


# 打开一个文件
f = open("e:/foo.txt", "r")

str = f.readline()
str = f.readline()
print(str)

# 关闭打开的文件
f.close()