package com.fdifrison.queue;

public class Test {

    public static void main(String[] args) {

        var queue = new QueueLinkedList<String>();

        queue.enqueue("John");
        System.out.println(queue);
        queue.enqueue("Jane");
        queue.enqueue("Jack");

        System.out.println(queue);
        System.out.println("removing head -> " + queue.dequeue());
        System.out.println("removing head -> " + queue.dequeue());
        System.out.println("removing head -> " + queue.dequeue());
        System.out.println("removing head -> " + queue.dequeue());
        System.out.println(queue);
        System.out.println("peeking head -> " + queue.peek());
    }
}
