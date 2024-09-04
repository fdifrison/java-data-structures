package com.fdifrison.linkedlist.implementation;

import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> head;
    private int numElements;

    @Override
    public void insert(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            insertFirst(data);
        }
        numElements++;
    }

    private void insertFirst(T data) {
        var newNode = new Node<>(data);
        newNode.setLinkToNextNode(head);
        head = newNode;
    }

    public void insertLast(T data, Node<T> node) {
        if (node.getLinkToNextNode() != null) {
            insertLast(data, node.getLinkToNextNode());
        } else {
            var newNode = new Node<>(data);
            node.setLinkToNextNode(newNode);
            newNode.setLinkToNextNode(null);
        }
        numElements++;
    }

    @Override
    public void remove(T data) {
        if (head == null) throw new NoSuchElementException();
        if (data.compareTo(head.getData()) == 0) {
            head = head.getLinkToNextNode();
        } else {
            remove(data, head, head.getLinkToNextNode());
        }
    }

    private void remove(T data, Node<T> current, Node<T> next) {
        while (next != null) {
            if (data.compareTo(next.getData()) == 0) {
                current.setLinkToNextNode(next.getLinkToNextNode());
                next = null; // to let gc remove the orphan element
                numElements--;
                return;
            }
            current = next;
            next = next.getLinkToNextNode();
            if (next == null) throw new NoSuchElementException();
        }
    }


    @Override
    public void traverse() {
        if (head == null) return;
        var node = head;
        while (node.getLinkToNextNode() != null) {
            System.out.println(node);
            node = node.getLinkToNextNode();
        }
        System.out.println(node.getData() + " -> null");
    }

    @Override
    public int size() {
        return numElements;
    }

    public Node<T> getHead() {
        return head;
    }
}
