package com.hashtable;

public class MyMapNode<K, V> implements INode<K> {

    private K key;
    private V value;
    private INode<K> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}
