package com.fdifrison.doublylinkedlist;

public class Test {

    public static void main(String[] args) {
        var list = new DoublyLinkedList<String>();
        list.addFirst("Jane");
        list.addFirst("John");
        list.addFirst("Bob");
        list.addLast("Mary");

        list.traverse();
        System.out.println("######");
        list.reverse();
        list.traverse();
    }
}
