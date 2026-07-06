# UC2 - Find Frequency of Words in a Paragraph Using Hash Table

## Problem Statement

Create a Hash Table to find the frequency of each word in the following paragraph:

```text
Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations
```

## Objective

Implement a custom Hash Table using Java Generics. Use the `hashCode()` method to calculate the bucket index and store key-value pairs in a LinkedList to handle collisions using Separate Chaining.

## Features

* Create a custom `MyMapNode<K, V>` for storing key-value pairs.
* Implement a Hash Table using an array of LinkedLists.
* Compute the bucket index using `hashCode()`.
* Handle collisions using Separate Chaining.
* Count the frequency of each word in the paragraph.
* Display all words along with their frequencies.

## Technologies Used

* Java
* Java Generics
* Hash Tables
* Linked Lists
* Object-Oriented Programming

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

```text
Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations
```

## Sample Output

```text
paranoids = 1
are = 2
not = 1
paranoid = 3
because = 2
they = 2
but = 1
keep = 1
putting = 1
themselves = 1
deliberately = 1
into = 1
avoidable = 1
situations = 1
```

## Concepts Covered

* Java Generics
* Hash Tables
* Hash Functions
* Separate Chaining
* Collision Handling
* Linked Lists

## Author

Raju
