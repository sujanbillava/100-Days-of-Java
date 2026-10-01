import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

public class combine 
{
    static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }    
    static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }    
    public static void main(String[] args) 
    {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(20);
        root.left.right=new Node(40);
        root.right=new Node(70);
        root.right.left=new Node(60);
        root.right.right=new Node(80);
        System.out.println("Preorder");
        preorder(root);
        System.out.println("Inorder");
        inorder(root);
        System.out.println("Postorder");
        postorder(root);
    }    
}
