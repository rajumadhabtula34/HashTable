package com.hashtable;

public class MyHashTable<K, V> {

    private MyLinkedList<K, V> linkedList;

    public MyHashTable() {
        linkedList = new MyLinkedList<>();
    }

    public void add(K key, V value) {

        MyMapNode<K, V> node = linkedList.search(key);

        if (node == null) {

            linkedList.append(new MyMapNode<>(key, value));

        } else {

            Integer count = (Integer) node.getValue();
            node.setValue((V) Integer.valueOf(count + 1));
        }
    }

    public void printFrequency() {
        linkedList.printList();
    }
}
