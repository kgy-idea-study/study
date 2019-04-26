class Student(object):
    __slots__ = ('name','age') # 用tuple定义允许绑定的属性名称

class GraduateStudent(Student):
    pass

if __name__ == "__main__":
    s = Student()  # 创建新的实例
    s.name = 'Michael'  # 绑定属性'name'
    s.age = 25  # 绑定属性'age'
    #s.score = 99 # 绑定属性'score'

    g = GraduateStudent()
    g.score = 9999
    