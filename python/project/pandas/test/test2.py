#!/usr/bin/env python
# -*- coding:utf-8 -*-

__author__ = 'kgy'

import pandas as pd

# Pandas提供了IO工具可以将大文件分块读取
# 使用不同分块大小来读取再调用 pandas.concat 连接DataFrame，chunkSize设置在1000万条左右速度优化比较明显。
# 实验结果足以说明，在非">5TB"数据的情况下，Python的表现已经能让擅长使用统计分析语言的数据分析师游刃有余。
reader = pd.read_csv('G:\OBS_ACCESSFAILE.txt', sep='|', header=None, iterator=True,low_memory=False)

loop = True
chunkSize = 1000000
chunks = []
while loop:
    try:
        chunk = reader.get_chunk(chunkSize)
        chunks.append(chunk)
    except StopIteration:
        loop = False
        print("Iteration is stopped.")
df = pd.concat(chunks, ignore_index=True)

gPapa = df.groupby(0).size().sort_values(ascending=False)

# gPapa.sort_values(by=1,ascending= False)
gPapa.to_csv('b.csv', index=True, sep=',', encoding='utf-8',header=False)
