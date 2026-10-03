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
public class Revision
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
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how Many Element should add in queue");
        int n=sc.nextInt();
        System.out.println("Enter Element");
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            q.offer(num);
        }
        System.out.println(q);
        q.poll();
        System.out.println(q);

        System.out.println("Enter how many Element should add in Stack");
        int n2=sc.nextInt();
        System.out.println("Enyter Element");
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n2;i++)
        {
            int num2=sc.nextInt();
            s.push(num2);
        }
        System.out.println(s);
        s.pop();
        System.out.println(s);

        Node root=null;
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,40);
        root=insert(root,50);
        root=insert(root,60);
        root=insert(root,70);
        root=insert(root,80);

        System.out.println("Inorder");
        inorder(root);
    }
}
