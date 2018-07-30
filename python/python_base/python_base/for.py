sites = ["Baidu", "Google","Runoob","Taobao"]
for site in sites:
	if site == "Runoob":
		print("菜鸟教程！")
		break
	print("循环数据 " + site)
else:
	print("没有循环数据!")
print("完成循环!")

for i in range(5):
	print(i)

for n in range(2, 10):
    for x in range(2, n):
        if n % x == 0:
            print(n, '等于', x, '*', n//x)
            break
    else:
        # 循环中没有找到元素
        print(n, ' 是质数')