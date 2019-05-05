package com.study.algorithms.leetcode;

import java.util.Stack;

/**
 * Created by chenc on 2019-05-03
 */
class MinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    /** initialize your data structure here. */
    public MinStack() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int x) {

        if(stackMin.isEmpty()){
            stackMin.push(x);
        }else if(x < getMin()){
            stackMin.push(x);
        }else{
            stackMin.push(getMin());
        }
        stackData.push(x);

    }

    public void pop() {
        stackData.pop();
        stackMin.pop();

    }

    public int top() {
        if(stackData.isEmpty()){
            throw new RuntimeException("stackData is empty");
        }
        return stackData.peek();

    }

    public int getMin() {
        if(stackMin.isEmpty()){
            throw new RuntimeException("stackMin is empty");
        }
        return stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
