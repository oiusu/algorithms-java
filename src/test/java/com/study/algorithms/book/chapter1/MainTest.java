package com.study.algorithms.book.chapter1;

/**
 * Created by chenc on 2019-04-28
 */
public class MainTest {

    public static void main(String[] args) {
//        testMyStack(new MyStack1());
        testMyStack(new MyStack2());

    }

    private static void testMyStack(AbstrackStack stack) {
//        MyStack1 stack1 = new MyStack1();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.toString());
        Integer min = stack.getMin();
        System.out.println("min="+min);

        Integer pop1 = stack.pop();
        System.out.println("pop1="+pop1);
        Integer min1 = stack.getMin();
        System.out.println("min1="+min1);
        System.out.println(stack.toString());

        Integer pop2 = stack.pop();
        System.out.println("pop2="+pop2);
        Integer min2 = stack.getMin();
        System.out.println("min2="+min2);
        System.out.println(stack.toString());

        Integer pop3 = stack.pop();
        Integer pop4 = stack.pop();
        Integer pop5 = stack.pop();
        Integer pop6 = stack.pop();
        Integer pop7 = stack.pop();
        Integer pop8 = stack.pop();
    }
}
