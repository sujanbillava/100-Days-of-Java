# Day 92 – Linked List Basics

## 📌 What is a Linked List?

A **Linked List** is a linear data structure in which elements are stored in separate units called **nodes**. Each node contains data and a reference to the next node, which connects the nodes together.

Unlike an array, a linked list does not require elements to be stored in contiguous memory locations.

## 🧩 Structure of a Node

Each node contains two parts:

- **Data:** Stores the value.
- **Next:** Stores the reference to the next node.

## 🔗 Example of a Linked List

```text
Head
 ↓
[10 | Next] → [20 | Next] → [30 | null]
```

Here:
- `Head` points to the first node.
- Each node points to the next node.
- The last node points to `null`, indicating the end of the list.

## 📚 Types of Linked Lists

1. **Singly Linked List:** Each node points to the next node.
2. **Doubly Linked List:** Each node points to both the previous and next nodes.
3. **Circular Linked List:** The last node connects back to the first node.


## ⏱️ Time Complexity

- Traversal: `O(n)`
- Access by position: `O(n)`
- Insertion at the beginning: `O(1)`

## 🎯 Applications of Linked Lists

- Implementing stacks and queues.
- Music playlists and navigation.
- Managing sequences of data that change in size.
- Representing and manipulating connected data.
