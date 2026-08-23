**# Day-44 Comparator in Java**

**## Topic**

Comparator in Java


### Comparator

* Used to define custom sorting rules
* Comparator is declared separately from the class being sorted
* Uses the `Comparator` interface
* Uses the `compare()` method

### compare() Method

* Used to compare two objects
* Takes two objects as parameters
* Returns a negative value if the first object comes before the second
* Returns a positive value if the first object comes after the second
* Returns `0` if both objects are equal according to the comparison rule

### Comparable vs Comparator

* `Comparable` uses `compareTo()`
* `Comparator` uses `compare()`
* Comparable sorting rule is generally inside the class
* Comparator sorting rule is outside the class
* Comparable is useful for a natural/default sorting order
* Comparator is useful when multiple sorting orders are required

### AgeComparator

* Used to sort students by age
* Ascending age:

```java
return s1.age - s2.age;
```

### NameComparator

* Used to sort students alphabetically by name
* Uses:

```java
return s1.name.compareTo(s2.name);
```

### AgeDescendingComparator

* Used to sort students by age in descending order
* Uses:

```java
return s2.age - s1.age;
```

### Collections.sort()

* Used to sort a list using a Comparator
* Syntax:

```java
Collections.sort(list, new AgeComparator());
```

* Different Comparator classes can be used with the same list


