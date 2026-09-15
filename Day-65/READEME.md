# Day 65 – BufferedReader & BufferedWriter

## 📌 Topic

**BufferedReader and BufferedWriter in Java**

## 🧠 1. BufferedReader

`BufferedReader` is used to **read text efficiently from a file**.

The important method is:

```java
readLine()
```

It reads **one complete line** at a time.

Example:

```java
String line;

while((line = br.readLine()) != null)
{
    System.out.println(line);
}
```

When the end of the file is reached, `readLine()` returns `null`.

---

## 🧠 2. BufferedWriter

`BufferedWriter` is used to **write text efficiently to a file**.

Important methods:

```java
write()
newLine()
close()
```

Example:

```java
bw.write("Sujan");
bw.newLine();
bw.write("AIML");
```

---

## 🔄 How They Work

### Reading

```text
File
 ↓
FileReader
 ↓
BufferedReader
 ↓
readLine()
 ↓
Complete Line
```

### Writing

```text
Java Program
 ↓
BufferedWriter
 ↓
write()
 ↓
newLine()
 ↓
File
```
