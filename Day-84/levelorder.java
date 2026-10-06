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
public class levelorder 
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
    static void LevelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node current=q.remove();
            System.out.println(current.data);
            if(current.left!=null)
            {
                q.add(current.left);
            }
            if(current.right!=null)
            {
                q.add(current.right);   
            }
        }

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
        
        LevelOrder(root);
    }
}
