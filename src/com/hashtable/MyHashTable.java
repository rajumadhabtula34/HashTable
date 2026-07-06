package com.hashtable;
public class MyHashTable<K, V> {

    private final int size = 10;
    private MyLinkedList<K, V>[] bucketArray;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        bucketArray = new MyLinkedList[size];

        for (int i = 0; i < size; i++) {
            bucketArray[i] = new MyLinkedList<>();
        }
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void add(K key, V value) {

        int index = getBucketIndex(key);

        MyLinkedList<K, V> list = bucketArray[index];

        MyMapNode<K, V> node = list.search(key);

        if (node == null) {
            list.append(new MyMapNode<>(key, value));
        } else {
            Integer count = (Integer) node.getValue();
            node.setValue((V) Integer.valueOf(count + 1));
        }
    }

    public void printFrequency() {

        for (int i = 0; i < size; i++) {
            bucketArray[i].printList();
        }
    }
}