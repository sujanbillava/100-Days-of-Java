# Day 75 - Stack

## 📌 Topic

Stack in Java

## 📖 What is Stack?

A Stack is a linear data structure that follows **LIFO (Last In, First Out)**.

The element added last is the first element removed.

### Example

```text
Push: 10
Push: 20
Push: 30

Stack: [10, 20, 30]

Pop → 30

Stack: [10, 20]
```

## 🔑 Important Stack Methods

| Method     | Purpose                           |
| ---------- | --------------------------------- |
| `push()`   | Adds an element to the top        |
| `pop()`    | Removes the top element           |
| `peek()`   | Returns the top element           |
| `empty()`  | Checks whether the stack is empty |
| `search()` | Searches for an element           |

## 💻 Java Syntax

```java
Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack);

stack.pop();

System.out.println(stack);

System.out.println(stack.peek());
```

## 🌍 Applications of Stack

* Undo/Redo operations
* Browser history
* Function calls
* Parentheses matching
* Expression evaluation
* Depth First Search (DFS)

## 🎯 Key Concept

**Stack → LIFO → Last In, First Out**

