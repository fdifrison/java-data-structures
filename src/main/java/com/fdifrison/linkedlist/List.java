package com.fdifrison.linkedlist;

public interface List<T> {

    void addFirst(T data);
    void addLast(T data);

    void remove(T data);

    void traverse();

    int size();
}
