# Day 78 - Binary Tree Basics 🌳

## 📌 Topic

Binary Tree Basics in Java

## 🧠 What is a Binary Tree?

A Binary Tree is a tree data structure where each node can have a maximum of two children:

* Left Child
* Right Child

Example:

```text
          50
         /  \
       30    70
      / \    / \
    20  40  60  80
```

## 🔹 Important Terms

### Node

A node stores data and references to its left and right children.

### Root

The topmost node of the tree.

In the above tree:

```text
50 → Root
```

### Parent

A node that has one or more children.

### Child

A node connected below another node.

### Leaf Node

A node that has no children.

In the above tree:

```text
20, 40, 60, 80 → Leaf Nodes
```

### Depth

The number of edges from the root to a node.

### Height

The longest path from a node to a leaf.

## 💻 Node Class

```java
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
```

### Explanation

```java
int data;
```

Stores the value of the node.

```java
Node left;
```

Stores the reference to the left child.

```java
Node right;
```

Stores the reference to the right child.

```java
this.data = data;
```

Stores the value received by the constructor inside the current Node.

```java
left = null;
right = null;
```

Initially, the node has no children.

## 🏗️ Creating a Binary Tree

```java
Node root = new Node(50);

root.left = new Node(30);
root.right = new Node(70);

root.left.left = new Node(20);
root.left.right = new Node(40);

root.right.left = new Node(60);
root.right.right = new Node(80);
```

This creates:

```text
          50
         /  \
       30    70
      / \    / \
    20  40  60  80
```

## 🌍 Real-World Applications

Binary trees are used in:

* Searching
* Sorting
* Databases
* Compilers
* Decision-making systems
* DSA problems

