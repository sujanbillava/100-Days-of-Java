# Day 80 – Binary Search Tree (BST) Basics 🌳

## 📌 Topic

**Binary Search Tree (BST)**

Today I learned how a Binary Search Tree works and how to insert nodes automatically using recursion.

## 🌳 What is a BST?

A Binary Search Tree is a special type of Binary Tree where:

```text
Left < Root < Right
```

For every node:

* Smaller values are placed on the left.
* Greater values are placed on the right.

Example:

```text
        50
       /  \
     30    70
    / \    / \
  20  40  60  80
```


## 🔹 BST Insertion

I learned how to insert a value automatically by comparing it with the current node.

```java
static Node insert(Node root, int data)
{
    if(root == null)
    {
        return new Node(data);
    }

    if(data < root.data)
    {
        root.left = insert(root.left, data);
    }
    else if(data > root.data)
    {
        root.right = insert(root.right, data);
    }

    return root;
}
```

### 🧠 Insertion Logic

If:

```text
data < root.data
```

→ move to the **left**.

If:

```text
data > root.data
```

→ move to the **right**.

If:

```text
root == null
```

→ create the new node.

## 💻 Concepts Learned

* Binary Search Tree
* BST ordering rule
* Left and right child relationships
* BST node creation
* Recursive insertion
* `insert()` method
* Inorder traversal of BST
* Building a BST automatically

