package com.fdifrison.queue;

public interface Queue<T extends Comparable<T>> {

    void enqueue(T data);

    T dequeue();

    T peek();
}
