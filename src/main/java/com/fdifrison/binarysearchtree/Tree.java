package com.fdifrison.binarysearchtree;

public interface Tree<T> {

    void insert(T data);

    void remove(T data);

    void traverse(); // NATURAL ORDERING

    T getMin();

    T getMax();
}
