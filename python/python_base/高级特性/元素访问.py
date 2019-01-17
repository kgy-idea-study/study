def check_index(key):
    """
    指定的键是否是可接受的索引？
    键必须是非负整数，才是可接受的。如果不是整数，
    将引发TypeError异常；如果是负数，将引发Index
    Error异常（因为这个序列的长度是无穷的）
    """
    if not isinstance(key, int): raise TypeError
    if key < 0: raise IndexError


class ArithmeticSequence:
    def __init__(self, start=0, step=1):
        """
        初始化这个算术序列
        start -序列中的第一个值
        step -两个相邻值的差
        changed -一个字典，包含用户修改后的值
        """
        self.start = start # 存储起始值
        self.step = step # 存储步长值

        self.changed = {}  # 没有任何元素被修改
    def __getitem__(self, key):
        """
        从算术序列中获取一个元素
        """
        check_index(key)
        try: return self.changed[key] # 修改过？
        except KeyError: # 如果没有修改过，
            return self.start + key * self.step # 就计算元素的值
    def __setitem__(self, key, value):
        """
        修改算术序列中的元素
        """
        check_index(key)
        self.changed[key] = value  # 存储修改后的值

s = ArithmeticSequence(1,2)
print(s[4])
s[4]=2
print(s[4])
print(s[5])


class Rectangle:
    def __int__(self):
        self.width = 0
        self.height = 0
    def set_size(self,size):
        self.width,self.height = size
    def get_size(self):
        return self.width,self.height
    size = property(get_size,set_size)

r = Rectangle()
r.width = 10
r.height = 5
print(r.size)

r.size = 150,100
print(r.width)