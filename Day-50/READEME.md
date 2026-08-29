# Day-50 — Stream API: map()

## 📚 Topic

Stream API — `map()` operation


### 1. `map()`

`map()` is an **intermediate operation** in Stream API.

It is used to **transform each element** into another value.

Example:

```java
list.stream()
    .map(n -> n * 2)
    .forEach(System.out::println);
```

If the list contains:

```text
10 20 30
```

Output:

```text
20
40
60
```

---

### 2. `filter()` vs `map()`

```text
filter() → SELECT elements based on a condition
map()    → TRANSFORM elements
```

Example:

```java
list.stream()
    .filter(n -> n > 50)
    .map(n -> n * 2)
    .forEach(System.out::println);
```

The `filter()` operation happens first, and its resulting elements are passed to `map()`.

---

### 3. `map()` Can Change Data Type

`map()` can transform one data type into another.

Example:

```java
list.stream()
    .map(n -> "Number: " + n)
    .forEach(System.out::println);
```

Concept:

```text
Stream<Integer>
      ↓
    map()
      ↓
Stream<String>
```

---

### 4. `map()` Does Not Modify the Original List

Example:

```java
list.stream()
    .map(n -> n * 2)
    .forEach(System.out::println);
```

The original `ArrayList` remains unchanged.

`map()` creates a new Stream containing the transformed values.

---

## 🔄 Stream Flow

```text
ArrayList
    ↓
stream()
    ↓
filter()       → select
    ↓
map()          → transform
    ↓
forEach()      → process/display
```
## 🧠 Key Memory

```text
filter() → SELECT
map()    → TRANSFORM
forEach() → PROCESS
```