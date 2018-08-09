print("{foo} {} {bar} {}".format(1, 2, bar=4, foo=3))

print("{foo} {1} {bar} {0}".format(1, 2, bar=4, foo=3))

fullname = ["Alfred", "Smoketoomuch"]
"Mr {name[1]}".format(name=fullname)

import math

tmpl = "The {mod.__name__} module defines the value {mod.pi} for π"

print(tmpl.format(mod=math))

print("{pi!s} {pi!r} {pi!a}".format(pi="π"))

print('{0:<10.2f}\n{0:^10.2f}\n{0:>10.2f}'.format(math.pi))


width = int(input('Please enter width: '))
price_width = 10
item_width = width - price_width
header_fmt = '{{:{}}}{{:>{}}}'.format(item_width, price_width)
fmt  = '{{:{}}}{{:>{}.2f}}'.format(item_width, price_width)
print('=' * width)
print(header_fmt.format('Item', 'Price'))
print('-' * width)
print(fmt.format('Apples', 0.4))
print(fmt.format('Pears', 0.5))
print(fmt.format('Cantaloupes', 1.92))
print(fmt.format('Dried Apricots (16 oz.)', 8))
print(fmt.format('Prunes (4 lbs.)', 12))
print('=' * width)