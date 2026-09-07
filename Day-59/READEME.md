# Day-59 — `Collectors.groupingBy()` & `partitioningBy()`

## 📌 Topics

1. `Collectors.groupingBy()`
2. `Collectors.partitioningBy()`

---

# 1. `Collectors.groupingBy()`

`groupingBy()` is a Stream API collector used to **group elements based on a classification condition or property**.

It returns the groups inside a `Map`.

### Basic Syntax

```java
Map<K, List<T>> result =
    stream.collect(Collectors.groupingBy(classificationFunction));
```

The value returned by the classification function becomes the **Map key**.

---

## 2. `groupingBy()` with Boolean

```java
List<Integer> numbers =
    Arrays.asList(5, 10, 15, 20, 25, 30);

Map<Boolean, List<Integer>> result =
    numbers.stream()
           .collect(Collectors.groupingBy(n -> n > 15));
```

### Result

```text
true  → [20, 25, 30]
false → [5, 10, 15]
```


# 11. `groupingBy()` vs `partitioningBy()`

| `groupingBy()`                                      | `partitioningBy()`                    |
| --------------------------------------------------- | ------------------------------------- |
| Can create multiple groups                          | Creates two groups                    |
| Key depends on classification function              | Key is always `Boolean`               |
| Keys can be `Integer`, `Character`, `Boolean`, etc. | Keys are `true` and `false`           |
| Used for general classification                     | Used when there are two categories    |
| Example: `n % 3` → `0, 1, 2`                        | Example: `n % 3 == 0` → `true, false` |

