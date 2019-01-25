import requests

resp = requests.get('https://www.baidu.com')
print(resp.status_code)
print(resp.encoding)
print(resp.headers)

resp1 = requests.post('https://www.baidu.com',data = {'hello': 'world'})

params = {'searchtype': '1','bookname': 'Detroit'}
resp = requests.get('https://httpbin.org/get', params=params)
print(resp.url)

datas = {'name': 'Connor', 'age': '22', 'height': '166'}
headers = {'User-Agent': 'ABCDE'}
resp = requests.post('https://www.httpbin.org/post', headers=headers, data=datas)
print(resp.json()['headers'])
