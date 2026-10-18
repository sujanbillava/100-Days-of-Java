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
public class practice2 
{

    public static void main(String[] args) 
    {
           Node first=new Node(10);
           Node second=new Node(20);
           Node third=new Node(30);
           Node fourth=new Node(50);
           
           Node head=first;
           first.next=second;
           second.next=third;
           third.next=fourth;
           fourth.next=null;

           int count=0;
           Node current=head;
           while(current!=null)
           {
                count=count+1;
                current=current.next;
           }
           System.out.println("Length="+count);

    }    
}
