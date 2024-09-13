package com.fdifrison.binarysearchtree;

public class Test {

    public static void main(String[] args) {

        var tree = new BinarySearchTree<Integer>();
        tree.insert(32);
        tree.insert(10);
        tree.insert(1);
        tree.insert(19);
        tree.insert(16);
        tree.insert(23);
        tree.insert(55);
        tree.insert(79);
        System.out.println("Tree min value is : " + tree.getMin());
        System.out.println("Tree max value is : " + tree.getMax());
        tree.traverse();
        tree.remove(19);
        tree.traverse();
    }
}
