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
public class Searchingelement 
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
    static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(key==root.data)
        {
            return true;
        }
        if(key<root.data)
        {
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Node root=null;
        root=insert(root,50);
        root=insert(root,60);
        root=insert(root,70);
        root=insert(root,80);
        root=insert(root,40);
        root=insert(root,75);
        root=insert(root,90);
        root=insert(root,10);
        System.out.println("Inorder");
        inorder(root);

        System.out.println("Enter which element to find");
        int key=sc.nextInt();
        if(search(root,key))
        {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
