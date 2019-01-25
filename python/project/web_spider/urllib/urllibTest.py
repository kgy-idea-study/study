from urllib import request

resp = request.urlopen('https://www.baidu.com')
print(resp)
print(type(resp))
print(resp.read().decode())

resp1 = request.urlopen('http://httpbin.org/post', data=b'word=hello')
print(resp1.read().decode())

url = 'http://httpbin.org/get'
headers = {'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36'}

# 需要使用url和headers生成一个Request对象，然后将其传入urlopen方法中
req = request.Request(url, headers=headers)
resp = request.urlopen(req)
print(resp.read().decode())

