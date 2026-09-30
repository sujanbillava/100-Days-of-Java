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
public class BinaryTree 
{
    public static void main(String[] args) 
    {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(70);
        root.left.left=new Node(20);
        root.left.right=new Node(40);
        root.right.left=new Node(60);
        root.right.right=new Node(80);
    }
}
