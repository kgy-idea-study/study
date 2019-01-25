from http import cookiejar
from urllib import request

url = 'https://www.baidu.com'
# 创建一个cookiejar对象
cookie = cookiejar.CookieJar()
# 使用HTTPCookieProcessor创建cookie处理器
cookies = request.HTTPCookieProcessor(cookie)
# 并以它为参数创建Opener对象
opener = request.build_opener(cookies)
# 使用这个opener来发起请求
resp = opener.open(url)

# 查看之前的cookie对象，则可以看到访问百度获得的cookie
for i in cookie:
    print(i)

