# Day 72 — Queue in Java

## 📌 Topic

**Queue**

## 📖 What is a Queue?

A **Queue** is a data structure that follows the **FIFO (First In, First Out)** principle.

The element that enters first is removed first.

Example:

```text
10 → 20 → 30 → 40
↑
Front
```



## 🔹 Queue Methods

### 1. `offer()`

Adds an element to the queue.

```java
q.offer(10);
```

### 2. `add()`

Also adds an element.

```java
q.add(20);
```

Difference: `offer()` returns `false` when an element cannot be added, while `add()` may throw an exception.

---

### 3. `peek()`

Returns the front element without removing it.

```java
q.peek();
```

If the queue is empty, it returns `null`.

---

### 4. `element()`

Returns the front element without removing it.

```java
q.element();
```

If the queue is empty, it throws `NoSuchElementException`.

---

### 5. `poll()`

Returns and removes the front element.

```java
q.poll();
```

If the queue is empty, it returns `null`.

---

### 6. `remove()`

Returns and removes the front element.

```java
q.remove();
```

If the queue is empty, it throws `NoSuchElementException`.

