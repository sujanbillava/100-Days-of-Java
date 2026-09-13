# Day 63 – Java File Handling

## 📌 Topic

**File Handling in Java**

File Handling is used to create, write, read, and manage data stored in files.

It is useful when we want to store data permanently instead of keeping it only while the program is running.

---

## 1. File Class

The `File` class is used to represent and manage files and directories.

### Example

```java
File file = new File("student.txt");
file.createNewFile();
```

`createNewFile()` creates the file if it does not already exist.

### Uses of `File`

* Create a file
* Check whether a file exists
* Get file information
* Delete a file
* Work with file paths

---

## 2. FileWriter

`FileWriter` is used to write character or text data into a file.

### Example

```java
FileWriter fw = new FileWriter("student.txt");

fw.write("Sujan\n");
fw.write("AIML\n");
fw.write("85\n");

fw.close();
```

The file will contain:

```text
Sujan
AIML
85
```

### Important Methods

* `write()` → writes data
* `close()` → closes the writer

---

## 3. FileReader

`FileReader` is used to read character or text data from a file.

### Example

```java
FileReader fr = new FileReader("student.txt");

int ch;

while((ch = fr.read()) != -1)
{
    System.out.print((char)ch);
}

fr.close();
```

### Important Point

`fr.read()` returns an `int`.

When the end of the file is reached, it returns:

```text
-1
```

Therefore:

```java
while((ch = fr.read()) != -1)
```

continues reading until the end of the file.

---

## 4. Try-Catch in File Handling

File operations can cause exceptions.

For example:

* File cannot be found
* Incorrect file path
* Permission problem
* Reading/writing problem

Therefore, file operations are commonly handled using `try-catch`.

### Example

```java
try
{
    FileReader fr = new FileReader("student.txt");
}
catch(IOException e)
{
    System.out.println("File Error");
}
```

`try` contains the file operation and `catch` handles the possible `IOException`.

---

## 5. Why `close()` is Important

After completing reading or writing, we should close the file.

```java
fw.close();
fr.close();
```

`close()` releases the resources being used by the file operation.

---

### Easy way to remember

```text
File       → Manage / Create 📁
FileWriter → Write ✍️
FileReader → Read 📖
```

