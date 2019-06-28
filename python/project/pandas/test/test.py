#!/usr/bin/env python
# -*- coding:utf-8 -*-

__author__ = 'kgy'

# 引入pandas
import pandas

# 加载papa.txt,指定它的分隔符是 \t
papa = pandas.read_csv('G:\OBS_ACCESSFAILE.txt', sep='|', header=None)
# print(papa.head(10))  # 显示数据的前几行

rowNum = papa.shape[0]  # 不包括表头
colNum = papa.columns.size

print('行数：', rowNum)
print('列数：', colNum)

# 计算某一列各个取值的个数
gPapa = papa.groupby(0).size().sort_values(ascending=False)
print(type(gPapa))

# gPapa.sort_values(by=1,ascending= False)
gPapa.to_csv('a.csv', index=True, sep=',', encoding='utf-8',header=False)
