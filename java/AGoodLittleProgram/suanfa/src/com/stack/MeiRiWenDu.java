package com.stack;

import java.util.Stack;

/**
 * @author kouguangyuan
 * @date 2018/11/8 14:21
 */
public class MeiRiWenDu {
    public int[] dailyTemperatures(int[] temperatures) {
        // 温度报表长度
        int temperaturesSize = temperatures.length;
        // 存储前日气温临时堆栈
        Stack<Integer> tempStack = new Stack<Integer>();
        // 最终结果响铃
        int[] result = new int[temperaturesSize];
        for (int i = 0; i < temperaturesSize; i++) {
            while (tempStack.size() > 0 && temperatures[tempStack.peek()] < temperatures[i]) {
                result[tempStack.peek()] = i - tempStack.peek();
                tempStack.pop();
            }
            tempStack.push(i);
        }
        return result;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> temp = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            int a = 0;
            int b = 0;

            if (temp.size() < 2) {
                temp.push(Integer.parseInt(tokens[i]));
                continue;
            }
            if ("+".equals(tokens[i])) {
                a = temp.peek();
                temp.pop();
                b = temp.peek();
                temp.pop();
                temp.push(a + b);
            } else if ("-".equals(tokens[i])) {
                a = temp.peek();
                temp.pop();
                b = temp.peek();
                temp.pop();
                temp.push(a - b);
            } else if ("*".equals(tokens[i])) {
                a = temp.peek();
                temp.pop();
                b = temp.peek();
                temp.pop();
                temp.push(a * b);
            } else if ("/".equals(tokens[i])) {
                a = temp.peek();
                temp.pop();
                b = temp.peek();
                temp.pop();
                temp.push(a / b);
            }
            temp.push(Integer.parseInt(tokens[i]));
        }
        return temp.peek();
    }
}
