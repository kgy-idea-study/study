import re

print(re.match(r'^\d{3}\-\d{3,8}$', '010-12345'))

print('a b    c'.split(' '))

print(re.split(r'\s+', 'a b     c'))

m = re.match(r'^(\d{3})-(\d{3,8})$', '010-12345')
print(m.group(0))
print(m.group(1))
print(m.group(2))
print(m.groups())

some_text = 'alpha, beta,,,,gamma delta'
print(re.split('[,]+',some_text))
print( re.split('o(o)','foobar'))

print(re.split('[, ]+', some_text, maxsplit=2))
print(re.split('[, ]+', some_text, maxsplit=1))

pat = '[a-zA-Z]+'
text = '"Hm... Err -- are you sure?" he said, sounding insecure.'
print(re.findall(pat, text))

pat1 = '{name}'
text1 = 'Dear {name}...'
print(re.sub(pat1, 'Mr. Gumby', text1))