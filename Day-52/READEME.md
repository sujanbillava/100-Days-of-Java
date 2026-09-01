# Day-52 — Stream API: reduce()

## 📚 Topic

Stream API — `reduce()` operation

### 1. What is `reduce()`?

`reduce()` is a **terminal operation** in Stream API.

It is used to **combine multiple Stream elements into one final result**.

Example:

```java
int sum = list.stream()
              .reduce(0, (a, b) -> a + b);
```

For:

```text
[10, 20, 30]
```

The calculation is:

```text
0 + 10 = 10
10 + 20 = 30
30 + 30 = 60
```

Final result:

```text
60
---

### 2. Parameters of `reduce()`

Example:

```java
.reduce(0, (a, b) -> a + b)
```

* `0` → initial value
* `a` → accumulator / previous result
* `b` → current element
* `a + b` → operation used to combine the values

Flow:

```text
Initial value
     ↓
Accumulator + Current value
     ↓
New accumulator
     ↓
Next value

## 🔝 Finding Maximum Using `reduce()`

```java
int max = list.stream()
              .reduce(Integer.MIN_VALUE,
                      (a, b) -> a > b ? a : b);
```

The larger value is kept at every step.

Example:

```text
[10, 50, 30, 80, 20]

10 vs 50 → 50
50 vs 30 → 50
50 vs 80 → 80
80 vs 20 → 80
```

Final:

```text
Maximum = 80
```

### `reduce()`

`reduce()` combines multiple elements into one final result.

```java
.reduce(0, (a, b) -> a + b)
```

Example:

```text
10 + 20 + 30 → 60
```

###  Easy Memory

```text
map()    → TRANSFORM
reduce() → COMBINE

###  Remember

```text
Intermediate → Stream → continue
Terminal     → final result/action → end

```text
filter() → SELECT
map()    → TRANSFORM
reduce() → COMBINE
forEach() → PROCESS / DISPLAY