# Java Data Structures

Small, standalone Java exercises covering arrays and linked lists. The project
currently contains an implemented singly linked list, an array-reversal
example, and the initial structure of a doubly linked list.

## Contents

| File | Description | Status |
| --- | --- | --- |
| `singlyLinkedList.java` | Integer singly linked list with insertion, search, update, deletion, and display operations. | Implemented |
| `reverseArray.java` | Reverses an integer array in place with a two-pointer approach. | Implemented |
| `DoublyLinkedList.java` | Defines a doubly linked-list node and list state (`head`, `tail`, and `size`). | In progress |

## Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or Java-capable IDE

These files do not declare a package, so they can be compiled directly from
the project directory.

## Compile

From the project directory, run:

```bash
javac singlyLinkedList.java reverseArray.java DoublyLinkedList.java
```

This creates `.class` files in the same directory. They are build artifacts
and are not part of the source code.

## Run the examples

Run the singly linked-list demonstration:

```bash
java singlyLinkedList
```

Run the array-reversal demonstration:

```bash
java reverseArray
```

`DoublyLinkedList` currently has an empty `main` method and does not yet
demonstrate list operations.

## Singly linked-list operations

The `singlyLinkedList` class stores integer values and provides:

- Insert at the head, tail, or a one-based position
- Check whether the list is empty and retrieve its size
- Read the head and tail values
- Search for a value or find its one-based position
- Update a value at a position, every matching value, or the first match
- Delete the head, tail, a one-based position, or the first matching value
- Print the list in `value->value->NULL` format

Invalid positions are reported to standard output. Reading the head or tail
of an empty list returns `-1` after printing a message.

## Notes

- The source uses the existing class names, including the lowercase
	`singlyLinkedList` name.
- `DoublyLinkedList.java` is scaffolding for future implementation; its
	constructor and node fields are package-private.
- The examples use primitive `int` values rather than generics.
