# Day-47 — Functional Interfaces

## Topic

Functional Interfaces in Java

## Topics Learned

* Functional Interface
* `@FunctionalInterface`
* Predicate
* Consumer
* Supplier
* Function
* Lambda Expressions with Functional Interfaces

## Concepts Learned

### Functional Interface

* An interface containing exactly one abstract method
* Can be implemented using Lambda Expression
* `@FunctionalInterface` is used to check that the interface has exactly one abstract method

### Predicate

* Used to check a condition
* Returns `true` or `false`
* Method: `test()`

### Consumer

* Takes/receives data
* Performs an operation
* Does not return a value
* Method: `accept()`

### Supplier

* Does not take input
* Supplies/returns a value
* Method: `get()`

### Function

* Takes an input of type `T`
* Returns a result of type `R`
* Used to transform data
* Method: `apply()`

## Easy Memory

* Predicate → Check → `test()`
* Consumer → Do → `accept()`
* Supplier → Give → `get()`
* Function → Transform → `apply()`

