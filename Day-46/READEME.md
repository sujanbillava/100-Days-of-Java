**# Day-46 Lambda Expressions in Java**

**## Topic**

Lambda Expressions


### Lambda Expression

* Short way of implementing the abstract method of a functional interface
* Basic syntax:

  * `(parameters) -> expression`
* Reduces the amount of code
* Does not require a separate Comparator class for simple sorting logic

### Functional Interface

* An interface with exactly one abstract method
* Lambda expressions can be used to implement the abstract method
* `Comparator` is a functional interface
* `Comparator` contains the abstract method `compare()`

### Lambda with Comparator

* Used Lambda expressions for sorting objects
* Compared two Student objects using `s1` and `s2`
* Sorted objects by age
* Sorted objects by rating
* Sorted objects by name


### toString()

* Used `toString()` to display Product objects
* Returned product name, price, and rating

**## Real-Life Example**

* Online shopping products can be sorted by:

  * Price
  * Rating
  * Name
* Lambda can provide different simple sorting rules without creating separate Comparator classes

