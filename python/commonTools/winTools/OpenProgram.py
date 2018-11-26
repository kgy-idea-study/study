import win32api

#启动软件脚本

'''ShellExecute(hwnd, op, file, args, dir, show)
hwnd:          父窗口的句柄，如果没有父窗口，则为0
op  :          要运行的操作，为open,print或者为空
file:          要运行的程序，或者打开的脚本
args:          要向程序传递的参数，如果打开的是文件则为空
dir :          程序初始化的目录 
show:          是否显示窗口
'''

#chrome启动
win32api.ShellExecute(0, 'open', r'C:\Program Files (x86)\Google\Chrome\Application\chrome.exe', '','',1)

#Foxmail
win32api.ShellExecute(0, 'open', r'F:\Foxmail 7.2\Foxmail.exe', '','',1)

#微信
win32api.ShellExecute(0, 'open', r'F:\WeChat\WeChat.exe', '','',1)

#idea启动
win32api.ShellExecute(0, 'open', r'F:\IntelliJ IDEA 2018.3\bin\idea64.exe', '','',1)
