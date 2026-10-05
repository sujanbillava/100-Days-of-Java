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
public class deletingBST 
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
    static Node delete(Node root,int key)
    {
        if(root==null)
        {
            return null;
        }
        if(key<root.data)
        {
            root.left=delete(root.left,key);
        }
        else if(key>root.data)
        {
            root.right=delete(root.right,key);
        }
        else
        {
            if(root.left==null&&root.right==null)
            {
                return null;
            }
            else if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else
            {
                Node successor=root.right;
                while(successor.left!=null)
                {
                    successor=successor.left;
                }
                root.data=successor.data;
                root.right=delete(root.right,successor.data);
                return root;
            }
        }
        return(root);
    }
    
    public static void main(String[] args)
    {
        Node root=null;
        root=insert(root,50);
        root=insert(root,40);
        root=insert(root,30);
        root=insert(root,20);
        root=insert(root,10);
        root=insert(root,5);
        root=insert(root,60);
        root=insert(root,70);
        root=insert(root,80);
        root=insert(root,90);
        root=insert(root,100);
        root=insert(root,0);

        root=delete(root,50);
        
        System.out.println("Inorder");
        inorder(root);
    }
    
}
