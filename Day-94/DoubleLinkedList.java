import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class DoubleLinkedList 
{
    public static void main(String[] args) 
    {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        
        Node head=first;
        head.prev=null;
        first.next=second;
        second.next=third;
        second.prev=first;
        third.next=null;
        third.prev=second;

        Node current=head;
        System.out.println("Forward");
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println("Backward");
        Node last=third;
        while(last!=null)
        {
            System.out.println(last.data);
            last=last.prev;
        }

    }    
}
