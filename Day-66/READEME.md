# Day 66 – Serialization & Deserialization

## 📌 Topic

**Serialization and Deserialization in Java**

## 📚 Concepts Covered

* Serialization
* Deserialization
* `Serializable` interface
* Marker Interface
* `ObjectOutputStream`
* `ObjectInputStream`
* `FileOutputStream`
* `FileInputStream`
* `writeObject()`
* `readObject()`
* Type casting during deserialization
* `NotSerializableException`
* `ClassNotFoundException`

## 🔹 Serialization

Serialization means converting a Java object into a form that can be stored in a file or transferred.

```java
class Student implements Serializable
```

## 🔹 Deserialization

Deserialization means converting the stored data back into a Java object.

```java
Student s = (Student) ois.readObject();
```

## 🔹 Important Methods

| Method          | Purpose                |
| --------------- | ---------------------- |
| `writeObject()` | Serializes an object   |
| `readObject()`  | Deserializes an object |

## 🔹 Important Classes

| Class                | Purpose                 |
| -------------------- | ----------------------- |
| `ObjectOutputStream` | Writes objects          |
| `ObjectInputStream`  | Reads objects           |
| `FileOutputStream`   | Writes bytes to a file  |
| `FileInputStream`    | Reads bytes from a file |

## 🎯 Key Points

* `Serializable` is a **marker interface**.
* A marker interface contains **no methods**.
* A class must implement `Serializable` to be serialized.
* `readObject()` returns an `Object`, so type casting may be required.
* Serialization: **Object → File**
* Deserialization: **File → Object**
