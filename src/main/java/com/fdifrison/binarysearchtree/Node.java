package com.fdifrison.binarysearchtree;

public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;

    public Node(T data, Node<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + '}';
    }

    public T getData() {
        return data;
    }

    public Node<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> setLeft(Node<T> left) {
        this.left = left;
        return this;
    }

    public Node<T> getRight() {
        return right;
    }

    public Node<T> setRight(Node<T> right) {
        this.right = right;
        return this;
    }

    public Node<T> getParent() {
        return parent;
    }

    public Node<T> setParent(Node<T> parent) {
        this.parent = parent;
        return this;
    }
}
