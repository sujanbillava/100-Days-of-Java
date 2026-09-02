# Day-54 — distinct() in Stream API

## 📚 Topic

**distinct() in Java Stream API**

## 🔹 What is distinct()?

`distinct()` is an **intermediate operation** in the Java Stream API.

It is used to **remove duplicate elements** from a Stream.

### Example

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(10);
list.add(30);
list.add(20);

list.stream()
    .distinct()
    .forEach(System.out::println);
```

### Output

```text
10
20
30
```

The duplicate `10` and `20` are removed.

---

## 🔹 Why is distinct() an Intermediate Operation?

`distinct()` returns a **Stream**, so we can continue the Stream pipeline with other operations.

Example:

```java
list.stream()
    .distinct()
    .sorted()
    .forEach(System.out::println);
```

Pipeline:

```text
ArrayList
   ↓
stream()
   ↓
distinct()
   ↓
sorted()
   ↓
forEach()
```
