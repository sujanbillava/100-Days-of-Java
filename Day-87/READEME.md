# Day 87: Recursion with Arrays and Strings in Java



## 1. Recursion with Arrays

An array stores multiple values of the same data type. We can use recursion to process each element one by one instead of using a loop.

### Example: Print Array Elements Using Recursion

```java
public class Recursion2 {

    static void printlist(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        System.out.println(arr[index]);
        printlist(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printlist(arr, 0);
    }
}
```

### Output

```text
10
20
30
40
50
```


## 2. Recursion with Strings

A string is a sequence of characters. We can use recursion to access and print each character using its index.

### Important String Methods

* `name.length()` returns the number of characters in the string.
* `name.charAt(index)` returns the character at the specified index.

### Example: Print String Characters Using Recursion

```java
public class Practice {

    static void printChar(String name, int index) {
        if (index == name.length()) {
            return;
        }

        System.out.println(name.charAt(index));
        printChar(name, index + 1);
    }

    public static void main(String[] args) {
        printChar("JAVA", 0);
    }
}
```

### Output

```text
J
A
V
A
```

