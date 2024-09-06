package com.fdifrison.linkedlist;

/**
 * We want the implementation to be generic and each element in the node to be comparable types
 */
public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
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

    @Override
    public String toString() {
        return data + " -> " + next.getData() + " ";
    }
}
