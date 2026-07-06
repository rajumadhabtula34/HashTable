package com.hashtable;

public class HashTableMain {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        MyHashTable<String, Integer> hashTable = new MyHashTable<>();

        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            hashTable.add(word, 1);
        }

        hashTable.printFrequency();
    }
}