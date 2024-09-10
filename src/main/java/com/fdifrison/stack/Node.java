package com.fdifrison.stack;

public class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data=" + data;
    }

    public T getData() {
        return data;
    }

    public Node<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
