package com.study.algorithms.book.chapter1;

import java.util.Stack;

/**
 * Created by ChenC on 2019/4/29 0029.
 */
public class MyStack2 implements AbstrackStack{
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack2() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum){
        //push 进去 总是放最小的 进 stackMin
        this.stackData.push(newNum);
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else {
            int curMin = getMin();
            if(curMin >= newNum){
                this.stackMin.push(newNum);
            }else{
                this.stackMin.push(curMin);
            }

        }
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("stackData is empty");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public int getMin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("stackMin is empty");
        }
        return this.stackMin.peek();
    }

    @Override
    public String toString() {
        return "MyStack2{" +
                "stackData=" + stackData +
                ", stackMin=" + stackMin +
                '}';
    }
}
