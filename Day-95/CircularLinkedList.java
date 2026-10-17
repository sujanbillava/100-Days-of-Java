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
public class CircularLinkedList 
{
    public static void main(String[] args) 
    {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        
        Node head=first;

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        Node current=head;
        do{
            System.out.println(current.data);
            current=current.next;
        }while(current!=head);
    }    
}
