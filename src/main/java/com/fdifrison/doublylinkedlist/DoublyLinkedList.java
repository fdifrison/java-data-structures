package com.fdifrison.doublylinkedlist;

import com.fdifrison.linkedlist.List;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void addFirst(T data) {
        var node = new Node<>(data);
        if (tail == null) {
            tail = node;
            head = node;
        } else {
            node.setNext(head);
            node.setPrev(null);
            head.setPrev(node);
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(T data) {
        var node = new Node<>(data);
        if (tail == null) {
            tail = node;
            head = node;
        } else {
            node.setPrev(tail);
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    @Override
    public void remove(T data) {
        if (head == null) throw new NoSuchElementException();
        if (head.getData().compareTo(data) == 0) {
            head = head.getNext();
            head.setPrev(null);
        } else if (tail.getData().compareTo(data) == 0) {
            tail = tail.getPrev();
            tail.setNext(null);
        } else {
            var node = head.getNext();
            while (node != null) {
                if (node.getData().compareTo(data) == 0) {
                    var next = node.getNext();
                    node = node.getPrev();
                    ;
                    node.setNext(next);
                    next.setPrev(node);
                }
                node = node.getNext();
            }
        }
    }

    @Override
    public void traverse() {
        var node = head;
        while (node.getNext() != null) {
            System.out.println(node);
            node = node.getNext();
        }
        System.out.println(node);
    }

    @Override
    public int size() {
        return size;
    }

    public void reverse() {
        if (head == null) return;
        var node = head;
        var prev = node.getPrev();
        var next = node.getNext();
        while (node != null) {
            next = node.getNext();
            node.setNext(prev);
            prev = node;
            node = next;
        }
        head = prev;
    }
}
