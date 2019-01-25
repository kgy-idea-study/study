from http import cookiejar
from urllib import request

#url = 'http://httpbin.org/ip'
url = 'https://www.baidu.com'
proxy = {'http': '192.168.13.24:80', 'https': '192.168.13.24:80'}
proxies = request.ProxyHandler(proxy)  # 创建代理处理器
opener = request.build_opener(proxies)  # 创建opener对象

resp = opener.open(url)
print(resp.read().decode())