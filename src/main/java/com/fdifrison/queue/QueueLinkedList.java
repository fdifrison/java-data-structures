package com.fdifrison.queue;

public class QueueLinkedList<T extends Comparable<T>> implements Queue<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public String toString() {
        if (isEmpty()) return "the queue is empty";
        StringBuilder sb = new StringBuilder("head -> ");
        var node = head;
        while (node.getNext() != null) {
            sb.append(node.getData()).append(" -> ");
            node = node.getNext();
        }
        return sb.append(node.getData()).append(" -> tail").toString();
    }

    private boolean isEmpty() {
        return head == null;
    }

    @Override
    public void enqueue(T data) {
        if (isEmpty()) head = tail = new Node<>(data);
        else {
            var oldTail = tail;
            tail = new Node<>(data);
            oldTail.setNext(tail);
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) return null;
        var oldHead = head;
        head = head.getNext();
        size--;
        return oldHead.getData();
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        return head.getData();
    }
}
