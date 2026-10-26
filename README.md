# Java Data Structures and Algorithms

A collection of standalone Java examples for practicing data structures and
algorithms. Each source file contains a small demonstration in its `main`
method. The examples use primitive `int` values and do not require external
dependencies.

## Contents

| File | Description |
| --- | --- |
| `singlyLinkedList.java` | Singly linked list with insertion, search, update, deletion, and display operations. |
| `DoublyLinkedList.java` | Doubly linked list with forward/backward traversal, insertion, search, update, and deletion. |
| `CircularLinkedList.java` | Circular singly linked list with insertion, search, deletion, and head/tail access. |
| `CircularDoublyLinkedList.java` | Circular doubly linked list with forward/backward traversal, insertion, search, and deletion. |
| `SortingAlgorithms.java` | Bubble sort, insertion sort, and selection sort. |
| `QuickSort.java` | Quick sort. |
| `MergeSort.java` | Merge sort. |
| `SearchingAlgo.java` | Linear search and binary search. |
| `reverseArray.java` | Reverses an integer array in place. |

## Requirements

- JDK 8 or later
- A terminal or Java-capable IDE

The classes do not declare packages, so compile and run them from the project
directory.

## Compile

Compile all examples with:

```bash
javac *.java
```

This creates `.class` files in the project directory.

## Run an example

Run any example by passing its class name to `java`, for example:

```bash
java singlyLinkedList
java DoublyLinkedList
java CircularLinkedList
java CircularDoublyLinkedList
java SortingAlgorithms
java QuickSort
java MergeSort
java SearchingAlgo
java reverseArray
```

`SearchingAlgo.binarySearch` expects the input array to be sorted. The sorting
examples modify their input arrays in place.
