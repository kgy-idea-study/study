package com.stack;

import java.util.*;

/**
 * @author kouguangyuan
 * @date 2018/11/8 8:52
 */
public class MinStack {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {}

    public void push(int x) {
        s1.push(x);
        if (s2.isEmpty() || s2.peek() >= x) s2.push(x);
    }

    public void pop() {
        // Cannot write like the following:
        // if (s2.peek() == s1.peek()) s2.pop();
        // s1.pop();
        int x = s1.pop();
        if (s2.peek() == x) s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-9);
        minStack.push(10);
        minStack.push(11);
        minStack.push(0);
        minStack.push(-13);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        System.out.println(2%1);
    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> temp = new LinkedHashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(temp.containsKey(nums[i])){
                return false;
            }else{
                temp.put(nums[i],1);
            }
        }
        return true;
    }

}
