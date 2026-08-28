# Day-49 — Stream API

## Topic

Stream API in Java

## Topics Learned

* Stream API
* `stream()`
* `filter()`
* `forEach()`
* Intermediate Operations
* Terminal Operations
* Stream vs ArrayList

### Stream API

* Provides methods to process data from collections
* Used with collections such as `ArrayList`
* Helps process data in a simple and efficient way

### `stream()`

* Converts a collection into a Stream
* Allows Stream operations to be performed

### `filter()`

* Used to check a condition
* Selects elements that satisfy the condition
* Returns a Stream
* It does not modify the original collection

### `forEach()`

* Performs an operation on every element
* Similar to iterating through elements using a loop
* Can be used to display or process elements

### Intermediate Operation

* Performs processing on Stream data
* Returns another Stream
* Examples:

  * `filter()`
  * `map()`
  * `sorted()`

### Terminal Operation

* Produces the final result
* Triggers execution of the Stream pipeline
* Examples:

  * `forEach()`
  * `collect()`
  * `count()`

## Stream Flow

```text
Collection
    ↓
stream()
    ↓
Intermediate Operation
    ↓
Terminal Operation
    ↓
Result
```

Example:

```java
list.stream()
    .filter(n -> n > 50)
    .forEach(System.out::println);
```

## Key Difference

```text
ArrayList → STORE data
Stream    → PROCESS data
```
