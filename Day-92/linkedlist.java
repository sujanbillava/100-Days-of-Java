import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class linkedlist 
{
    public static void main(String[] args) 
    {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        
        Node head=first;
        first.next=second;
        second.next=third;
        third.next=null;
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
        
    }
}
