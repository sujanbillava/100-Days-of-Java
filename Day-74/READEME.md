# Day 74 — Deque (Double-Ended Queue)

## 📚 Topic

**Deque (Double-Ended Queue) in Java**

Deque stands for **Double-Ended Queue**.

Unlike a normal Queue, a Deque allows us to **add and remove elements from both the front and rear**.

---

## 1. Creating a Deque

`Deque` is an interface, so we use a class such as `ArrayDeque`.

```java
Deque<Integer> dq = new ArrayDeque<>();
```

We cannot directly create an object of the interface:

```java
new Deque<>(); // ❌
```

---

## 2. `addFirst()`

Adds an element at the **front** of the Deque.

```java
dq.addFirst(10);
```


## 3. `addLast()`

Adds an element at the **rear**.

```java
dq.addLast(40);
```


## 4. `removeFirst()`

Removes the element from the **front**.

```java
dq.removeFirst();
```


## 5. `removeLast()`

Removes the element from the **rear**.

```java
dq.removeLast();
```


## 6. `peekFirst()`

Returns the front element **without removing it**.

```java
dq.peekFirst();
```

---

## 7. `peekLast()`

Returns the rear element **without removing it**.

```java
dq.peekLast();
```

