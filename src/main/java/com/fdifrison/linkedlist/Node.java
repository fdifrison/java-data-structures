package com.fdifrison.linkedlist;

/**
 * We want the implementation to be generic and each element in the node to be comparable types
 */
public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> linkToNextNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Node<T> getLinkToNextNode() {
        return linkToNextNode;
    }

    public void setLinkToNextNode(Node<T> linkToNextNode) {
        this.linkToNextNode = linkToNextNode;
    }

    @Override
    public String toString() {
        return data + " -> " + linkToNextNode.getData() + " ";
    }
}
