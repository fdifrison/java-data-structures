package com.fdifrison.linkedlist;

public class Test {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("John");
        list.addFirst("Jane");
        list.addFirst("Doe");
        list.addLast("Mike");
        list.traverse();
        list.remove("Jane");
        list.traverse();
        list.remove("J");
    }
}
