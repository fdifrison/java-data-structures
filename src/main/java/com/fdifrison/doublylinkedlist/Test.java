package com.fdifrison.doublylinkedlist;

public class Test {

    public static void main(String[] args) {
        var list = new DoublyLinkedList<String>();
        list.addFirst("Jane");
        list.addFirst("John");
        list.addFirst("Bob");
        list.addLast("Mary");

        list.traverse();

        list.remove("Bob");
        System.out.println("######");
        list.traverse();

        list.remove("Jane");
        System.out.println("######");
        list.traverse();

    }
}
