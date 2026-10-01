# Day 79 – Binary Tree Traversal 🌳

## 📌 Topic

**Binary Tree Traversal using Recursion**

Today I learned how to visit every node of a Binary Tree using three important traversal techniques:

* Preorder Traversal
* Inorder Traversal
* Postorder Traversal

## 🔹 1. Preorder Traversal

**Order:**

`Root → Left → Right`

Example output:

```text
50
30
20
40
70
60
80
```

Java logic:

```java
static void preorder(Node root)
{
    if(root == null)
    {
        return;
    }

    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
}
```

## 🔹 2. Inorder Traversal

**Order:**

`Left → Root → Right`

Example output:

```text
20
30
40
50
60
70
80
```

Java logic:

```java
static void inorder(Node root)
{
    if(root == null)
    {
        return;
    }

    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
}
```

## 🔹 3. Postorder Traversal

**Order:**

`Left → Right → Root`

Example output:

```text
20
40
30
60
80
70
50
```

Java logic:

```java
static void postorder(Node root)
{
    if(root == null)
    {
        return;
    }

    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data);
}
```

## 🌳 Tree Used

```text
          50
         /  \
       30    70
      / \    / \
    20  40  60  80
```


## 🧠 Key Learning

The main difference between the three traversals is **where the root is processed**:

| Traversal | Order               |
| --------- | ------------------- |
| Preorder  | Root → Left → Right |
| Inorder   | Left → Root → Right |
| Postorder | Left → Right → Root |

