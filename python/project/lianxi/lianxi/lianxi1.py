# -*- coding: utf-8 -*-

print('I\'m ok.')

classmates = ['Michael', 'Bob', 'Tracy']
print(classmates)
print(len(classmates))
classmates.append('Adam')
print(classmates)
classmates.insert(1,'jack')
classmates.pop()


import sqlite3

conn = sqlite3.connect('test.db')
cursor = conn.cursor()
cursor.execute('create table user (id varchar(20) primary key, name varchar(20))')
cursor.execute('insert into user (id, name) values (\'1\', \'Michael\')')


conn.commit()

cursor.execute('select * from user where id=?', ('1',))

values = cursor.fetchall()

print(values)
cursor.close()
conn.close()