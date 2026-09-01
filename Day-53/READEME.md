# Day-53 — Stream API: sorted()

## 📚 Topic

Stream API — `sorted()` operation
### 1. What is `sorted()`?

`sorted()` is an **intermediate operation** in Stream API.

It is used to sort elements in a Stream.

Example:

```java
list.stream()
    .sorted()
    .forEach(System.out::println);
```

For:

```text
[40, 10, 80, 20]
```

Output:

```text
10
20
40
80
```

By default, `sorted()` sorts numbers in **ascending order**.

---

## 2. Descending Order

To sort in descending order, we can use:

```java
list.stream()
    .sorted((a, b) -> b - a)
    .forEach(System.out::println);
```

Example:

```text
[40, 10, 80, 20]
```

Output:

```text
80
40
20
10
```

###  Remember

```text
a - b → Ascending
b - a → Descending
```

---

## 3. Why is `sorted()` an Intermediate Operation?

`sorted()` returns another Stream.

Therefore, we can continue with another Stream operation after it.

Example:

```java
list.stream()
    .sorted()
    .filter(n -> n > 50)
    .forEach(System.out::println);
```
