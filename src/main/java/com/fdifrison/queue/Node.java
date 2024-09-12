package com.fdifrison.queue;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
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

    public Node<T> setNext(Node<T> next) {
        this.next = next;
        return this;
    }
}
