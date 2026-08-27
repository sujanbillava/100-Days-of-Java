# Day-48 — Method Reference

## Topic

Method Reference in Java

## Topics Learned

* Method Reference
* Lambda Expression vs Method Reference
* `::` operator
* Method Reference with Functional Interfaces
* Method Reference with `forEach()`
* Method Reference with `Function`

## Concepts Learned

### Method Reference

* A shorter way of writing a Lambda Expression
* Used when Lambda only calls an existing method
* Uses the `::` operator
* Helps make code shorter and easier to read

### Syntax

```text
ClassName::methodName
```

Example:

```java
String::toUpperCase
```

Object method reference:

```java
System.out::println
```

### Lambda vs Method Reference

Lambda:

```java
name -> System.out.println(name)
```

Method Reference:

```java
System.out::println
```

Both perform the same operation.

### `::` Operator

* `::` is used to refer to an existing method
* It does not call the method immediately

```text
:: → Refer to method
() → Call method
```

### Method Reference with Function

```java
Function<String,String> upper = String::toUpperCase;
```

```java
upper.apply("Sujan");
```

