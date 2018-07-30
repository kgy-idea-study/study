print(sorted(['bob', 'about', 'Zoo', 'Credit'], key=str.lower))

L = [('Bob', 75), ('Adam', 92), ('Bart', 66), ('Lisa', 88)]

def by_name(t):
    return t[0]

L2 = sorted(L, key=by_name)
print(L2)

def by_score(t):
    return -t[1]

L2 = sorted(L, key=by_score)
print(L2)