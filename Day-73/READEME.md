# Day 73 — Thread Communication Basics

## 📚 Topic

**Thread Communication in Java**

Thread communication allows one thread to **wait, communicate, and coordinate with another thread**.

---

## 1. `wait()`

`wait()` makes the current thread wait until another thread sends a notification.

```java
sd.wait();
```

### Important:

* `wait()` belongs to the **Object class**.
* It releases the object's lock while waiting.
* It should normally be used inside `synchronized`.
* It can throw `InterruptedException`.

---

## 2. `notify()`

`notify()` wakes up **one waiting thread** that is waiting on the same object.

```java
sd.notify();
```

It is commonly used after changing shared data.

---

## 3. `notifyAll()`

`notifyAll()` wakes up **all threads** waiting on the same object.

```java
sd.notifyAll();
```

### Difference

| Method        | Meaning                   |
| ------------- | ------------------------- |
| `wait()`      | Makes a thread wait       |
| `notify()`    | Wakes one waiting thread  |
| `notifyAll()` | Wakes all waiting threads |

---

## 4. `synchronized`

`wait()`, `notify()`, and `notifyAll()` require the thread to own the object's **monitor lock**.

Example:

```java
synchronized(sd)
{
    sd.wait();
}
```

This also prevents multiple threads from accessing the shared data at the same time.

---

## 5. `wait()` vs `sleep()`

| `wait()`                          | `sleep()`                       |
| --------------------------------- | ------------------------------- |
| Used for thread communication     | Used for time-based pause       |
| Belongs to `Object`               | Belongs to `Thread`             |
| Releases the object's lock        | Does not release the lock       |
| Waits for notification/condition  | Waits for specified time        |
| Normally used with `synchronized` | Does not require `synchronized` |

---

## 6. `while` with `wait()`

We learned that `wait()` should generally be used inside a condition-checking loop.

```java
while(!sd.available)
{
    sd.wait();
}
```

The condition is checked again after the thread wakes up.

---

## 7. Producer–Consumer

A common use of thread communication is the **Producer–Consumer pattern**.

### Producer

The Producer creates the data:

```java
sd.number = 100;
sd.available = true;
sd.notify();
```

### Consumer

The Consumer waits if the data is not available:

```java
while(!sd.available)
{
    sd.wait();
}

System.out.println("Consumed=" + sd.number);
```

### Flow

```text
Producer
   ↓
Produces data
   ↓
available = true
   ↓
notify()
   ↓
Consumer wakes
   ↓
Consumes data
```

---

## 8. `InterruptedException`

`wait()` can throw `InterruptedException`, so it must be handled.

```java
try
{
    sd.wait();
}
catch(InterruptedException e)
{
    System.out.println("Error");
}
```

---

## ⭐ Key Points

```text
wait()       → waits for communication
notify()     → wakes one waiting thread
notifyAll()  → wakes all waiting threads
synchronized → provides monitor/lock
Object       → contains wait/notify methods
sleep()      → pauses for a specified time
```
