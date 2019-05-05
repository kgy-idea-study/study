#!/usr/bin/env python 
# -*- coding:utf-8 -*-

import asyncio
import threading

@asyncio.coroutine
def hello():
    print('Hello world! (%s)' % threading.currentThread())
    yield from asyncio.sleep(1)
    print('Hello again! (%s)' % threading.currentThread())

# 获取EventLoop:
loop = asyncio.get_event_loop()
# 执行coroutine
# loop.run_until_complete(hello())

tasks = [hello(), hello()]
loop.run_until_complete(asyncio.wait(tasks))
loop.close()
