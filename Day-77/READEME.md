# Day 77 - Infix, Prefix & Postfix Expressions

## 📌 Topic

Infix, Prefix and Postfix Expressions using Stack

### 1. Infix Expression

The operator is written between operands.

Example:

```text
A + B
A * B
```

### 2. Prefix Expression

The operator is written before operands.

Example:

```text
+A B
*AB
```

### 3. Postfix Expression

The operator is written after operands.

Example:

```text
AB+
AB*
```

## 🧠 Why Stack is Used

Stack follows **LIFO (Last In, First Out)**.

It is useful for expression conversion because operators need to be temporarily stored and processed according to their precedence.

## ⚡ Operator Precedence

```text
()
* /
+ -
```

Higher-precedence operators are processed before lower-precedence operators.

## 🔄 Examples

### Infix → Postfix

```text
A + B       → AB+
A + B * C   → ABC*+
(A+B)*C     → AB+C*
A*(B+C)-D   → ABC+*D-
```

### Infix → Prefix

```text
A+B         → +AB
(A+B)*C     → *+ABC
(A+B)/C     → /+ABC
```
