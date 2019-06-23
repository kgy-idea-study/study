#!/usr/local/bin/python3
# -*- coding:utf-8 -*-

import sys

def read_input(file):
    for line in file:
        yield line

def main():
    data = read_input(sys.stdin)

    for words in data:
            print(words)

if __name__ == '__main__':
    main()