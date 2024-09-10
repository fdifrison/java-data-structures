package com.fdifrison.stack;

public class Test {

    public static void main(String[] args) {
        var stack = new StackLinkedList<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

        var stackArray = new StackArray<Integer>(5);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.push(6);

        System.out.println(stackArray);

        System.out.println(stackArray.pop());
        System.out.println(stackArray.peek());
        System.out.println();
        System.out.println(stackArray);
    }
}
