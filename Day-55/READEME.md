# Day-55 — Java

## 📚 Topic

**limit() in Stream API**

## 🔹 What is limit()?

`limit()` is an **intermediate operation** in the Java Stream API.

It is used to take only a **specified number of elements** from a Stream.

### Syntax

```java
stream.limit(number);
```

For example:

```java
list.stream()
    .limit(3)
    .forEach(System.out::println);
```

This takes only the first 3 elements.

---

## 🔹 Example

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);

list.stream()
    .limit(3)
    .forEach(System.out::println);
```

### Output

```text
10
20
30
```

`limit(3)` means:

> Take only the first 3 elements.




### What is skip()?

skip() is an intermediate operation in the Java Stream API.

It is used to skip the first specified number of elements from a Stream.

Syntax
stream.skip(number);

For example:

list.stream()
    .skip(2)
    .forEach(System.out::println);

skip(2) means:

Skip the first 2 elements.

🔹 Example
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);

list.stream()
    .skip(2)
    .forEach(System.out::println);
Output
30
40
50

The first two elements, 10 and 20, are skipped.

🔹 limit() vs skip()
limit()

limit(3) takes only the first 3 elements.

10  20  30  40  50
↓   ↓   ↓
10  20  30
skip()

skip(3) skips the first 3 elements.

10  20  30  40  50
↑   ↑   ↑
skip

        40  50
Easy way to remember
limit → TAKE
skip  → IGNORE