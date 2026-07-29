# 🚀 Day 18 - Java Arrays (Part 2)


## 📖 Topics Covered

* Counting Occurrences in an Array
* Reverse Array
* Sum of Even and Odd Elements
* Second Largest Element

---

## 💻 Programs Completed

### 1️⃣ Counting Occurrences

**Concept:** Count how many times a particular element appears in an array.

**Key Learning:**

* Used a `count` variable.
* Compared every element with the search value.
* Did not use `break` because every occurrence must be counted.

---

### 2️⃣ Reverse Array

**Concept:** Print array elements in reverse order.

**Key Learning:**

* Started the loop from `array.length - 1`.
* Used `i--` to move backwards.
* Learned that reverse printing does **not** modify the original array.

---

### 3️⃣ Sum of Even and Odd Elements

**Concept:** Calculate the sum of even and odd numbers separately.

**Key Learning:**

* Used `% 2 == 0` to identify even numbers.
* Stored results in `evenSum` and `oddSum`.
* Traversed the array only once.

---

### 4️⃣ Second Largest Element

**Concept:** Find the second largest element without sorting.

**Key Learning:**

* Used two variables: `largest` and `secondLargest`.
* Learned the update logic:

  * If current element is greater than `largest`:

    * `secondLargest = largest`
    * `largest = current element`
  * Otherwise, if current element is greater than `secondLargest`, update `secondLargest`.

---



### ⭐ Day 18 Completed Successfully

**"Logic first, code second."** 💻🚀
