import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class linkedListPractice 
{
    public static void main(String[] args) 
    {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(40);
        Node fourth=new Node(50);
        // Node five=new Node(60);
        
        Node head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        // fourth.next=five;
        fourth.next=null;

        
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);

        
    }    
}
