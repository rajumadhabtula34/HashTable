package com.hashtable;

public class MyLinkedList<K, V> {

    private INode<K> head;

    public MyMapNode<K, V> search(K key) {

        INode<K> temp = head;

        while (temp != null) {

            if (temp.getKey().equals(key)) {
                return (MyMapNode<K, V>) temp;
            }

            temp = temp.getNext();
        }

        return null;
    }

    public void append(INode<K> newNode) {

        if (head == null) {
            head = newNode;
            return;
        }

        INode<K> temp = head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
    }

    public void printList() {

        INode<K> temp = head;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
}