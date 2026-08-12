# Day 32 - ArrayList in Java

## Topics Learned

* What is ArrayList?
* Difference between Array and ArrayList
* Creating an ArrayList
* `add()`
* `get()`
* `set()`
* `remove()`
* `size()`
* `contains()`
* Traversing an ArrayList
* Normal `for` loop
* Enhanced `for` loop
* Finding sum
* Finding highest value
* Finding lowest value
* Calculating average

## Array vs ArrayList

```text
Array       → Fixed size
ArrayList   → Dynamic size
```

An ArrayList can grow or shrink as elements are added or removed.

## Important Methods

| Method       | Purpose                          |
| ------------ | -------------------------------- |
| `add()`      | Adds an element                  |
| `get()`      | Gets an element using its index  |
| `set()`      | Changes an element               |
| `remove()`   | Removes an element               |
| `size()`     | Returns the number of elements   |
| `contains()` | Checks whether an element exists |

## Traversal

Traversal means **visiting every element one by one**.

### Normal for loop

```java
for(int i = 0; i < num.size(); i++)
{
    System.out.println(num.get(i));
}
```

Use a normal `for` loop when the **index is needed**.

### Enhanced for loop

```java
for(int value : num)
{
    System.out.println(value);
}
```

