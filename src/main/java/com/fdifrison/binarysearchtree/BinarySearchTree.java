package com.fdifrison.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    private Node<T> insert(Node<T> parent, T data) {
        return switch (parent.getData().compareTo(data)) {
            case 0 -> parent;
            case 1 -> parent.getLeft() == null
                    ? parent.setLeft(new Node<>(data, parent))
                    : insert(parent.getLeft(), data);
            case -1 -> parent.getRight() == null
                    ? parent.setRight(new Node<>(data, parent))
                    : insert(parent.getRight(), data);
            default -> throw new RuntimeException();
        };
    }

    private Node<T> compare(Node<T> left, Node<T> right) {
        return switch (left.getData().compareTo(right.getData())) {
            case 1 -> left;
            case -1 -> right;
            default -> throw new RuntimeException();
        };
    }

    private Node<T> findEqual(Node<T> parent, T data) {
        return switch (parent.getData().compareTo(data)) {
            case 0 -> parent;
            case 1 -> parent.getLeft() == null ? null : findEqual(parent.getLeft(), data);
            case -1 -> parent.getRight() == null ? null : findEqual(parent.getRight(), data);
            default -> throw new RuntimeException();
        };
    }

    private boolean isLeave(Node<T> node) {
        return node.getLeft() == null && node.getRight() == null;
    }

    private boolean has1Child(Node<T> node) {
        return (node.getLeft() == null && node.getRight() != null)
                || (node.getLeft() != null && node.getRight() == null);
    }

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data, null);
        } else {
            insert(root, data);
        }
    }

    private void removeNode(Node<T> node) {
        var parent = node.getParent();
        if (parent.getLeft().getData() == node.getData()) parent.setLeft(null);
        if (parent.getRight().getData() == node.getData()) parent.setRight(null);
    }

    @Override
    public void remove(T data) {
        if (root != null) {
            var node = findEqual(root, data);
            if (node == null) return;
            if (isLeave(node)) {
                removeNode(node);
            } else if (has1Child(node)) {
                var grandChild = node.getLeft() == null ? node.getRight() : node.getLeft();
                removeNode(node);
                node.getParent().setLeft(grandChild);
            } else {
                // looking for the predecessor -> the biggest node in the left branch
                var predecessor = getMax(node.getLeft());
                node.setData(predecessor.getData());
                removeNode(predecessor);
            }
        }
    }

    @Override
    public void traverse() {
        if (root == null) return;
        traverse(root);
    }

    private void traverse(Node<T> node) {
        if (node.getLeft() != null) {
            traverse(node.getLeft());
        }
        System.out.println(node.getData());
        if (node.getRight() != null) {
            traverse(node.getRight());
        }
    }

    @Override
    public T getMin() {
        if (root == null) return null;
        var node = root;
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node.getData();
    }

    @Override
    public T getMax() {
        if (root == null) return null;
        var node = root;
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node.getData();
    }

    public Node<T> getMax(Node<T> node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;
    }
}
