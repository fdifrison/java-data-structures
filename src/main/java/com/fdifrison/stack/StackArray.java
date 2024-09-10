package com.fdifrison.stack;

@SuppressWarnings("unchecked")
public class StackArray<T> implements Stack<T> {

    T[] stack;
    int index;

    public StackArray(int size) {
        stack = (T[]) new Object[size];
    }

    @Override
    public String toString() {
        System.out.println("Item in the Stack:");
        StringBuilder str = new StringBuilder();
        var counter = index - 1;
        while (counter >= 0) {
            str.append(stack[counter]).append(" at index ").append(counter).append("\n");
            counter--;
        }
        return str.toString();
    }

    @Override
    public T peek() {
        return stack[index - 1];
    }

    @Override
    public T pop() {
        var item = stack[--index];
        stack[index] = null;
        return item;
    }

    @Override
    public void push(T element) {
        if (index == stack.length) {
            resize();
        }
        stack[index++] = element;
        System.out.printf("Pushing %s in the stack\n", element);
    }

    private void resize() {
        System.out.println("Resizing the stack");
        var copy = (T[]) new Object[stack.length * 2];
        System.arraycopy(stack, 0, copy, 0, stack.length);
        stack = copy;
    }
}
