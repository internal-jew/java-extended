package com.alevel.mitin.Collections;

public class SomeLinkedList<T> {
    int size;
    Node first;
    Node last;

    public void addFirst(T object) {
        if (first == null && last == null) {
            first = last = new Node<T>(null, object, null);
        } else {
            Node<T> newNode = new Node<T>(null, object, first);
            Node<T> oldNode = first;
            first = newNode;
            first.nextNode = oldNode;
        }
        size++;
    }

    public void addLast(T object) {
        if (first == null && last == null) {
            first = last = new Node<T>(null, object, null);
        } else {
            Node<T> newNode = new Node<T>(last, object, null);
            Node<T> oldNode = last;
            last = newNode;
            last.previousNode = oldNode;
        }
        size++;
    }

    public T getFirst() {
        Node<T> tt = first;
        return tt.data;
    }

    public T getLast() {
        Node<T> tt = last;
        return tt.data;
    }

    public T removeFirst() {
        Node<T> tt = first;
        first = first.nextNode;
        first.previousNode = null;
        size--;
        return tt.data;
    }

    public T removeLast() {
        Node<T> tt = last;
        last = last.previousNode;
        last.nextNode = null;
        size--;
        return tt.data;
    }

    public boolean isFirst(Node node) {
        return node.previousNode == null && node.nextNode != null;
    }

    public boolean isLast(Node node) {
        return node.previousNode != null && node.nextNode == null;
    }

    private static class Node<T> {
        Node previousNode;
        Node nextNode;
        T data;

        public Node(Node prev, T data, Node next) {
            this.previousNode = prev;
            this.nextNode = next;
            this.data = data;
        }
    }
}
