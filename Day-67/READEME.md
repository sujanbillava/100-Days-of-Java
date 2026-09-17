# Day 67 – Generics in Java

## 📌 Topic

**Generics in Java**

## 📚 Concepts Covered

* What are Generics?
* Type parameter `T`
* Generic Class
* Type Safety
* Code Reusability
* Primitive vs Wrapper Classes
* Generic Class vs Normal Class
* `Box<String>`
* `Box<Integer>`
* Real-life use of Generics

## 🔹 What are Generics?

Generics allow us to specify the data type that a class, method, or collection can work with.

They provide:

* **Type Safety**
* **Code Reusability**

Example:

```java
ArrayList<String> names = new ArrayList<>();
```

`<String>` specifies that the ArrayList stores String values.

## 🔹 Generic Class

A generic class uses a type parameter such as `T`.

```java
class Box<T>
{
    T value;

    void set(T value)
    {
        this.value = value;
    }

    T get()
    {
        return value;
    }
}
```

The same class can work with different data types:

```java
Box<String> a = new Box<>();
Box<Integer> b = new Box<>();
```

Here:

```text
Box<String>  → T = String
Box<Integer> → T = Integer
```

## 🔹 Type Parameter

`T` is a type parameter that acts as a placeholder for a data type.

Common generic letters:

* `T` → Type
* `E` → Element
* `K` → Key
* `V` → Value

## 🔹 Primitive and Wrapper Types

Generics cannot directly use primitive types.

```java
ArrayList<int>       // ❌
ArrayList<Integer>   // ✅
```

Examples:

| Primitive | Wrapper     |
| --------- | ----------- |
| `int`     | `Integer`   |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |

## 🎯 Advantages of Generics

1. Provides type safety.
2. Improves code reusability.
3. Reduces the need for type casting.
4. Allows the same class or method to work with different data types.

