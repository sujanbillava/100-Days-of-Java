import java.io.*;
import  java.util.*;
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
public class heighttree 
{
    static Node insert(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        if(data<root.data)
        {
            root.left=insert(root.left,data);
        }
        else if(data>root.data)
        {
            root.right=insert(root.right,data);
        }
        return(root);
    }
    static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return 1+Math.max(leftheight,rightheight);
    }
    public static void main(String[] args) 
    {
        Node root=null;
        root=insert(root,50);
        root=insert(root,40);
        root=insert(root,70);
        root=insert(root,80);
        root=insert(root,90);
        root=insert(root,30);
        root=insert(root,20);
        
        System.out.println(height(root));
    }
}
