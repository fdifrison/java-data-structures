package com.fdifrison.stack;

public class StackLinkedList<T> implements Stack<T> {

    private Node<T> head = null;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        System.out.println("Item in the Stack:");
        StringBuilder str = new StringBuilder();
        var node = head;
        while (node != null) {
            str.append(node).append("\n");
            node = node.getNext();
        }
        return str.toString();
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        return head.getData();
    }

    @Override
    public T pop() {
        var item = peek();
        if (head != null) {
            head = head.getNext();
            size--;
        }
        return item;
    }

    @Override
    public void push(T element) {
        if (head == null) {
            head = new Node<>(element);
        } else {
            var old = head;
            head = new Node<>(element);
            head.setNext(old);
        }
        size++;
    }
}
