### Day 86 – Recursion Basics

**Recursion** is a programming technique where a method **calls itself repeatedly** to solve a problem by breaking it into smaller and simpler parts.

#### Meaning

In recursion, a method keeps calling itself with a smaller or simpler input until it reaches a **base case**.

A recursive method mainly has two parts:

1. **Base Case** – The condition that stops the recursion.
2. **Recursive Call** – The method calling itself with a smaller or changed value.

#### Example

```java
static void run(int n)
{
    if(n==0)
    {
        return;
    }

    run(n-1);
    System.out.println(n);
}
```

Calling:

```java
run(5);
```

#### Output

```text
1
2
3
4
5
```

#### How It Works

```text
run(5)
 ↓
run(4)
 ↓
run(3)
 ↓
run(2)
 ↓
run(1)
 ↓
run(0) → Stop
```

After reaching the base case, the previous method calls return one by one and execute the remaining statements.

#### Important Concepts

* **Base Case:** Stops the recursive calls.
* **Recursive Call:** Calls the same method again.
* **Call Stack:** Stores each method call until it returns.
* **Smaller Input:** Each recursive call should move toward the base case.
* Recursion can be useful for **trees, linked lists, searching, sorting, and backtracking**.

#### Key Learning

Recursion allows a large problem to be solved by repeatedly solving **smaller versions of the same problem**.

**Day 86 – Completed ✅**
