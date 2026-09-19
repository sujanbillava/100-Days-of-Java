# Day 69 — Thread Names in Java

## 1. Thread Name

A thread name is a name given to a thread to identify it while it is running.

Java automatically gives names to threads such as:

* `Thread-0`
* `Thread-1`
* `Thread-2`

## 2. `setName()`

`setName()` is used to set or change the name of a thread.

Example:

```java
t.setName("DownloadThread");
```

## 3. `getName()`

`getName()` is used to get the name of a thread.

Example:

```java
t.getName();
```

## 4. `currentThread()`

`currentThread()` returns the thread that is currently executing.

Example:

```java
Thread.currentThread();
```

In Day 69, we used it together with `getName()`:

```java
Thread.currentThread().getName();
```

This gets the name of the currently running thread.

> **Note:** `currentThread()` itself will be studied in detail on Day 72.

## Why Use Thread Names?

Thread names help us identify which thread is performing a particular task, especially when multiple threads are running.

Example:

```text
DownloadThread → Downloading
UploadThread   → Uploading
`