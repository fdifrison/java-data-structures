package com.fdifrison.doublylinkedlist;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> next;
    private Node<T> prev;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        var prev = this.prev == null ? "null" : this.prev.getData();
        var next = this.next == null ? "null" : this.next.getData();
        return  prev + " <- " + data + " -> " + next;
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

    public Node<T> getPrev() {
        return prev;
    }

    public Node<T> setPrev(Node<T> prev) {
        this.prev = prev;
        return this;
    }
}
