# Day 94 – Doubly Linked List in Java

## 📌 What is a Doubly Linked List?

A **Doubly Linked List** is a linear data structure consisting of nodes. Each node stores data and two references: one to the previous node and another to the next node.

This structure allows traversal in both forward and backward directions.

## 🧩 Structure of a Node

Each node contains three parts:

- `prev`: Reference to the previous node.
- `data`: Stores the value.
- `next`: Reference to the next node.

## 🔗 Example

```text
null ← 10 ↔ 20 ↔ 30 → null
```

- The first node's `prev` is `null`.
- The last node's `next` is `null`.
- Each middle node links to both its previous and next nodes.

#

## ⏱️ Time and Space Complexity

- Forward traversal: `O(n)`
- Backward traversal: `O(n)`
- Extra space for traversal: `O(1)`

## 🎯 Applications

- Browser navigation
- Music playlists with previous and next controls
- Undo and redo operations
- Implementing certain data structures
