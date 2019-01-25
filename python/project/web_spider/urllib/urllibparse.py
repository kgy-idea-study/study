from urllib import parse

print(parse.quote('底特律'))

print(parse.unquote('%E5%BA%95%E7%89%B9%E5%BE%8B',encoding='utf-8'))

paramers = {'address': '底特律', 'phone': '123456789', 'name': 'Connor'}

print(parse.urlencode(paramers))

print(parse.urlencode(paramers,encoding='utf-8'))
print(parse.urlencode(paramers,encoding='gbk'))