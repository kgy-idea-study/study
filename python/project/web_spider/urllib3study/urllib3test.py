import urllib3
import json

http = urllib3.PoolManager(num_pools=5,headers={'User-Agent':'ABCDE'})
resp1 = http.request('GET','http://www.baidu.com')
print(resp1.data.decode())

resp2 = http.urlopen('GET', 'http://www.baidu.com')
print(resp2.data.decode())


data = json.dumps({'abc': '123'})
resp3 = http.request('POST', 'http://www.httpbin.org/post', body=data)
print(resp3.data.decode())

resp4 = http.urlopen('POST', 'http://www.httpbin.org/post', body=data)
print(resp4.data.decode())


data = {'abc': '123'}
proxy = urllib3.ProxyManager('http://50.233.137.33:80', headers={'connection': 'keep-alive'})
resp1 = proxy.request('POST', 'http://www.httpbin.org/post', field=data,timeout=5 )
print(resp1.data.decode())
