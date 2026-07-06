# UC1 - Find Frequency of Words in a Sentence

## Problem Statement

Create a Hash Table using a LinkedList to find the frequency of each word in the sentence:

```
To be or not to be
```

## Objective

Implement a custom Hash Table without using Java's built-in `HashMap`. Store each word as a key and its occurrence count as the value using a LinkedList of custom map nodes.

## Features

* Create a custom `MyMapNode<K, V>` to store key-value pairs.
* Implement a generic `LinkedList` to store map nodes.
* Search for an existing word in the list.
* Increment the frequency if the word already exists.
* Add a new node if the word is encountered for the first time.
* Display the frequency of all words.

## Technologies Used

* Java
* Java Generics
* Object-Oriented Programming
* Linked List

## Project Structure

```
src/
│
├── INode.java
├── MyMapNode.java
├── MyLinkedList.java
├── MyHashTable.java
└── HashTableMain.java
```

## Sample Input

```
To be or not to be
```

## Sample Output

```
to = 2
be = 2
or = 1
not = 1
```

## Concepts Covered

* Java Generics
* Interfaces
* Custom Linked List
* Key-Value Pair
* Word Frequency Counting
* Basic Hash Table Operations

## Author

Raju
