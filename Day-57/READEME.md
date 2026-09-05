# Day 57 — Java Stream API

## 📚 Topics Covered

* `findFirst()`
* `Optional`
* `orElse()`
* `findAny()`
* `peek()`
---

## 1. findFirst()

`findFirst()` is used to get the **first element** from a Stream.

```java
Optional<Integer> result = list.stream()
                               .findFirst();
```

Example:

```text
10, 20, 30
```

Result:

```text
Optional[10]

### 2. Optional

`findFirst()` and `findAny()` return an `Optional`.

Why?

Because the Stream may not contain a matching element.

Example:

```java
Optional<Integer> result = list.stream()
                               .filter(n -> n > 50)
                               .findFirst();
```

If there is no matching value:

```text
Optional.empty
```

---

## 3. get()

`get()` extracts the actual value from an `Optional`.

```java
System.out.println(result.get());
```

If:

```text
result = Optional[50]
```

Output:

```text
50
```

⚠️ `get()` should not be used blindly because an empty `Optional` has no value to get.

---

## 4. orElse()

`orElse()` provides a **default value** when the `Optional` is empty.

```java
int result = list.stream()
                 .filter(n -> n > 50)
                 .findFirst()
                 .orElse(100);
```

If a matching value exists:

```text
60 → result = 60
```

If no matching value exists:

```text
result = 100
```

## 5. findAny()

`findAny()` returns **any available element** from a Stream.

```java
Optional<Integer> result = list.stream()
                               .findAny();
```

Unlike `findFirst()`, you should not depend on which particular element `findAny()` chooses.

## 7. peek()

`peek()` is mainly used to **observe elements while a Stream pipeline is executing**.

Example:

```java
list.stream()
    .peek(n -> System.out.println("Checking: " + n))
    .forEach(n -> System.out.println("Result: " + n));
```

Output:

```text
Checking: 10
Result: 10
Checking: 20
Result: 20
```

`peek()` does not normally change the elements.

