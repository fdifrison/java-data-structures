package com.fdifrison.linkedlist.implementation;

public class Test {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.insert("John");
        list.insert("Jane");
        list.insert("Doe");
        list.insertLast("Mike", list.getHead());
        list.traverse();
        list.remove("Jane");
        list.traverse();
        list.remove("J");
    }
}
