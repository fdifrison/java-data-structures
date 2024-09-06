package com.fdifrison.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int size;

    @Override
    public void addFirst(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            insertFirst(data);
        }
        size++;
    }

    private void insertFirst(T data) {
        var newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public void addLast(T data) {
        insertLast(data, head);
    }

    private void insertLast(T data, Node<T> node) {
        if (node.getNext() != null) {
            insertLast(data, node.getNext());
        } else {
            var newNode = new Node<>(data);
            node.setNext(newNode);
            newNode.setNext(null);
        }
        size++;
    }

    @Override
    public void remove(T data) {
        if (head == null) throw new NoSuchElementException();
        if (data.compareTo(head.getData()) == 0) {
            head = head.getNext();
        } else {
            remove(data, head, head.getNext());
        }
    }

    private void remove(T data, Node<T> current, Node<T> next) {
        while (next != null) {
            if (data.compareTo(next.getData()) == 0) {
                current.setNext(next.getNext());
                next = null; // to let gc remove the orphan element
                size--;
                return;
            }
            current = next;
            next = next.getNext();
            if (next == null) throw new NoSuchElementException();
        }
    }

    @Override
    public void traverse() {
        if (head == null) return;
        var node = head;
        while (node.getNext() != null) {
            System.out.println(node);
            node = node.getNext();
        }
        System.out.println(node.getData() + " -> null");
    }

    @Override
    public int size() {
        return size;
    }

    public Node<T> getHead() {
        return head;
    }
}
