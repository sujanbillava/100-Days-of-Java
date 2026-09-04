# Day-56 — Java Stream API

## 📌 Topics Covered
1. `count()`
2. `anyMatch()`
3. `allMatch()`
4. `noneMatch()`

---

## 1. `count()`

`count()` counts the number of elements in a Stream.

### Syntax

```java
long count = list.stream()
                 .count();
```

### Important

`count()` returns **`long`**, not `int`.


## 2. `anyMatch()`

`anyMatch()` checks whether **at least one element** satisfies a condition.

It returns a `boolean`.

```java
boolean result = list.stream()
                     .anyMatch(n -> n > 50);
```

* At least one matches → `true`
* No element matches → `false`

### Short-circuiting

`anyMatch()` can stop processing as soon as it finds a matching element.

---

## 3. `allMatch()`

`allMatch()` checks whether **all elements** satisfy a condition.

```java
boolean result = list.stream()
                     .allMatch(n -> n > 5);
```

* All elements match → `true`
* Even one element does not match → `false`

---

## 4. `noneMatch()`

`noneMatch()` checks whether **no elements** satisfy a condition.

```java
boolean result = list.stream()
                     .noneMatch(n -> n > 50);
```

* No element matches → `true`
* At least one element matches → `false`

---

## 🧠 Quick Comparison

| Method        | Meaning                  | Return Type |
| ------------- | ------------------------ | ----------- |
| `count()`     | How many elements?       | `long`      |
| `anyMatch()`  | Does at least one match? | `boolean`   |
| `allMatch()`  | Do all match?            | `boolean`   |
| `noneMatch()` | Does no element match?   | `boolean`   |

