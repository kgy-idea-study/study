import re

print(re.match(r'^\d{3}\-\d{3,8}$', '010-12345'))

print('a b    c'.split(' '))

print(re.split(r'\s+', 'a b     c'))

m = re.match(r'^(\d{3})-(\d{3,8})$', '010-12345')
print(m.group(0))
print(m.group(1))
print(m.group(2))
print(m.groups())