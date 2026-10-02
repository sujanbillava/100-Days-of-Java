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
public class Practice 
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
    public static void main(String[] args) 
    {
        Node root=null;
        
        root=insert(root,50);
        root=insert(root,30);
        root=insert(root,70);
        root=insert(root,20);
        root=insert(root,40);
        root=insert(root,60);
        root=insert(root,80);
        root=insert(root,35);

        System.out.println("Inorder");
        inorder(root);
    }
}
