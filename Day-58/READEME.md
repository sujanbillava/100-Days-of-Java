# 📘 Day-58 — Collectors.toList() & Collectors.toSet()

## 🎯 Topics Covered

1. `Collectors.toList()`
2. `Collectors.toSet()`

# 1. Collectors.toList()

`Collectors.toList()` is used to collect Stream elements into a `List`.

### Example

```java
List<Integer> result = list.stream()
                           .filter(n -> n > 10)
                           .map(n -> n * 3)
                           .collect(Collectors.toList());
```

### Example Input

```text
5 10 15 20 25 30
```

### Output

```text
[45, 60, 75, 90]
```
The numbers greater than 10 are selected, multiplied by 3, and collected into a List.

# 2. Collectors.toSet()

`Collectors.toSet()` is used to collect Stream elements into a `Set`.

A Set does not keep duplicate values.

### Example

```java
Set<Integer> result = list.stream()
                          .collect(Collectors.toSet());
```

### Input

```text
10 20 20 30 30 40
```

### Output

```text
[10, 20, 30, 40]
```

The duplicate values are removed.

# 6. List vs Set

| List                    | Set                                   |
| ----------------------- | ------------------------------------- |
| Allows duplicates       | Does not allow duplicates             |
| `Collectors.toList()`   | `Collectors.toSet()`                  |
| Maintains List behavior | Does not guarantee List-like ordering |
| Example: `[10,20,20]`   | Example: `[10,20]`                    |
```

### Q8. What happens if the Stream is empty?

An empty Set is produced rather than `null`.
