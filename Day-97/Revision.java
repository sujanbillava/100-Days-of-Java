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
public class Revision 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node four=new Node(40);
        Node five=new Node(50);
        
        Node head=first;
        first.next=second;
        second.next=third;
        third.next=four;
        four.next=five;
        five.next=null;

        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
        current=head;
        int count=0;
        while(current!=null)
        {
            count=count+1;
            current=current.next;
        }
        System.out.println("Length="+count);

        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle="+slow.data);

        System.out.println("Enter Number you want to search");
        int num=sc.nextInt();
        current=head;
        boolean found=false;
        while(current!=null)
        {
            if(current.data==num)
            {
                found=true;
                System.out.println("Element Found");
                break;
            }
            current=current.next;
        }
        if(found==false)
        {
            System.out.println("Element Not Found");
        }

    }    
}
