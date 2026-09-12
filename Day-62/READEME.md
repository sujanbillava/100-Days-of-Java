# 🚀 Day 62 – Java Exception Handling

## 📚 Topics Covered

  **Exception Handling in Java**.

The five important keywords covered were:

1. `try`
2. `catch`
3. `finally`
4. `throw`
5. `throws`

---

## 1. `try`

The `try` block contains code that may cause an exception.

```java
try
{
    int result = 10 / 0;
}
```

---

## 2. `catch`

The `catch` block is used to handle an exception that occurs inside the `try` block.

```java
try
{
    int result = 10 / 0;
}
catch(ArithmeticException e)
{
    System.out.println("Cannot divide by zero");
}
```

### Easy way to remember:

**try → risky code**
**catch → handles the exception**

---

## 3. `finally`

The `finally` block executes whether an exception occurs or not.

```java
try
{
    int result = 10 / 2;
    System.out.println(result);
}
catch(ArithmeticException e)
{
    System.out.println("Error");
}
finally
{
    System.out.println("Calculation completed");
}
```

### Easy way to remember:

**finally → executes at the end**

---

## 4. `throw`

`throw` is used to **manually throw an exception**.

Example:

```java
if(age < 18)
{
    throw new Exception("Not Eligible");
}
```

Here, we are actually throwing the exception.

### Remember:

**throw → actually throws the exception**

---

## 5. `throws`

`throws` is used in a method declaration to indicate that the method may throw an exception.

```java
public static void checkAge(int age) throws Exception
{
    if(age < 18)
    {
        throw new Exception("Not Eligible");
    }

    System.out.println("Eligible");
}
```

### Remember:

**throws → declares that the method may throw an exception**

---

# 🔥 Difference Between `throw` and `throws`

| `throw`                      | `throws`                                      |
| ---------------------------- | --------------------------------------------- |
| Actually throws an exception | Declares that a method may throw an exception |
| Used inside a method         | Used in method declaration                    |
| Throws an exception object   | Tells the caller about a possible exception   |

### Easy memory trick:

**`throw` = "I am throwing it."** 💥
**`throws` = "This method may throw it."** ⚠️

