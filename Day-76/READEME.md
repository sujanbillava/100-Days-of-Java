# Day 76 - Stack Application

## 📌 Topic

**Balanced Parentheses using Stack**

## 📖 Concept

A Stack follows **LIFO (Last In, First Out)**.

We can use a Stack to check whether brackets in an expression are properly balanced.

The three bracket pairs are:

* `()`
* `[]`
* `{}`

## 🔑 Logic

1. If an opening bracket `(`, `[`, or `{` is found, **push** it into the Stack.
2. If a closing bracket is found:

   * Check whether the Stack is empty.
   * Check whether the top element matches the closing bracket.
   * If it matches, **pop** the opening bracket.
   * If it does not match, the expression is unbalanced.
3. After processing the complete string, check the Stack.
4. If the Stack is not empty, some opening brackets were not closed.
5. If the Stack is empty and no mismatch occurred, the expression is balanced.

## 💻 Example

```text
Input:
{[()]}

Processing:
{ → push
[ → push
( → push
) → pop
] → pop
} → pop

Stack → empty

Output:
Balanced
```

## ❌ Unbalanced Example

```text
Input:
((())

Output:
Unbalanced
```

The Stack still contains an opening bracket after processing the complete string.

## 🎯 Key Concept

```text
Opening bracket → PUSH
Closing bracket → PEEK + POP
End of expression → Stack must be EMPTY
```

## 🌍 Applications

Balanced-parentheses checking is useful in:

* Compiler syntax checking
* Programming-language parsing
* Expression validation
* Code editors
* Expression evaluation
