# Day 68 — Multithreading in Java

## 1. Thread

A thread is a lightweight unit of execution inside a program that performs a specific task.

## 2. Multithreading

Multithreading means executing multiple threads concurrently within a single program.

## 3. `extends Thread`

A class can extend the `Thread` class to create a thread. The task is written inside the `run()` method.

## 4. `implements Runnable`

`Runnable` is an interface used to define a task that can be executed by a thread.

## 5. `start()`

`start()` starts a new thread. The JVM then calls the `run()` method.

## 6. `run()`

`run()` contains the task that the thread needs to execute.

## 7. `Thread.sleep()`

`sleep()` temporarily pauses the currently running thread for a specified amount of time.

Example:

```java
Thread.sleep(2000);
```

This pauses the thread for approximately 2 seconds.

## 8. `join()`

`join()` makes the current thread wait until another thread finishes its execution.

## 9. Thread Priority

Thread priority indicates the priority level given to a thread.

Java provides priorities from **1 to 10**:

* `1` → Minimum
* `5` → Default
* `10` → Maximum

Higher priority does not guarantee that the thread will execute first.

## 10. `setPriority()`

`setPriority()` is used to set the priority of a thread.

Example:

```java
t.setPriority(8);
```

## 11. `getPriority()`

`getPriority()` is used to get the current priority of a thread.

Example:

```java
System.out.println(t.getPriority());
```

## 12. `InterruptedException`

`InterruptedException` can occur when a thread that is sleeping or waiting using methods such as `sleep()` or `join()` is interrupted.

It can be handled using `try-catch` or `throws`.

## Important Differences

### `start()` vs `run()`

* `start()` → starts a new thread.
* `run()` → contains the task and executes when the thread starts.

### `sleep()` vs `join()`

* `sleep()` → pauses the current thread for a specified time.
* `join()` → makes the current thread wait until another thread finishes.

### `Thread` vs `Runnable`

* `Thread` → class used to create and control a thread.
* `Runnable` → interface used to define a task for a thread.

