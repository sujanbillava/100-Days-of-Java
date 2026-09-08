# 📘 Day 60 – Java Stream API

## Topic: `counting()` with `partitioningBy()` and `groupingBy()`

## 1. `partitioningBy()` + `counting()`

### What is `partitioningBy()`?

`partitioningBy()` divides elements into exactly **two groups**:

* `true`
* `false`

When we add `counting()`, instead of storing the elements, it counts how many elements are present in each group.

### Syntax

```java
Map<Boolean, Long> result =
    numbers.stream()
           .collect(Collectors.partitioningBy(
               condition,
               Collectors.counting()
           ));
```

### Example

```java
List<Integer> numbers =
    Arrays.asList(10, 15, 20, 25, 30, 35, 40);

Map<Boolean, Long> result =
    numbers.stream()
           .collect(Collectors.partitioningBy(
               n -> n % 2 == 0,
               Collectors.counting()
           ));

System.out.println(result);
```

### Output

```text
{false=3, true=4}
```

Explanation:

```text
Even numbers → 10, 20, 30, 40 → true → 4
Odd numbers  → 15, 25, 35      → false → 3
```

### Important point

`counting()` always returns `Long`.



# 2. `groupingBy()` + `counting()`

### What is `groupingBy()`?

`groupingBy()` groups elements according to a classification expression.

Unlike `partitioningBy()`, it can create **more than two groups**.

When `counting()` is added, it counts the number of elements in each group.

### Syntax

```java
Map<KeyType, Long> result =
    numbers.stream()
           .collect(Collectors.groupingBy(
               classification,
               Collectors.counting()
           ));
```

---

## Example

Given:

```text
[4, 5, 6, 14, 15, 24, 25, 26, 35]
```

Using:

```java
groupingBy(n -> n / 10, counting())
```

The groups are:

```text
4, 5, 6       → 0 → 3
14, 15        → 1 → 2
24, 25, 26    → 2 → 3
35            → 3 → 1
```

Output:

```text
{0=3, 1=2, 2=3, 3=1}
```

---

