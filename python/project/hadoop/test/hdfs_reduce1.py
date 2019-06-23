#!/usr/local/bin/python3
# -*- coding:utf-8 -*-

import sys
from operator import itemgetter
from itertools import groupby


def read_mapper_output(file, separator='|'):
    for line in file:
        yield line.rstrip().split(separator, 1)


def main():
    data = read_mapper_output(sys.stdin)

    for current_word, group in groupby(data, itemgetter(0)):
        list = []
        for current_word, text in group:
            list.append("%s%s%s" % (current_word, "|", text))

        if len(list) >= 3:
            for i in list:
                print(i)


if __name__ == '__main__':
    main()
