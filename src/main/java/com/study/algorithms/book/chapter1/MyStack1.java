package com.study.algorithms.book.chapter1;

import java.util.Stack;

/**
 * Created by chenc on 2019-04-28
 */
public class MyStack1 implements AbstrackStack{

    private Stack<Integer> stackData ;
    private Stack<Integer> stackMin ;

    public MyStack1() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum){
        this.stackData.push(newNum);

        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum <= getMin()){
            this.stackMin.push(newNum);
        }

    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("stackData is empty");
        }
        int pop = this.stackData.pop();

        if(pop == getMin()){
            this.stackMin.pop();
        }
        return pop;
    }

    public int getMin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("stackMin is empty");
        }
        return this.stackMin.peek();

    }


    @Override
    public String toString() {
        return "MyStack1{" +
                "stackData=" + stackData.toString() +
                ", stackMin=" + stackMin.toString() +
                '}';
    }
}

