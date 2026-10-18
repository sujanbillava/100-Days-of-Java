 
# Day 95 — Circular Linked List in Java

## 📘 Meaning of Circular Linked List

A **Circular Linked List** is a linked list in which the last node points back to the first node (`head`) instead of pointing to `null`.

Each node contains:
- **data** — stores the value.
- **next** — stores the reference to the next node.

In a circular linked list, traversal can continue around the circle, so we need a stopping condition to avoid an infinite loop.

## 🔗 Diagram

```text
       ┌──────────────────────────────┐
       ↓                              │
Head → [10] → [20] → [30] → [40] ─────┘
```

The last node (`40`) points back to the first node (`10`).


## 🌍 Applications

- Round-robin CPU scheduling.
- Circular playlists.
- Turn-based games.
- Repeated task scheduling.

