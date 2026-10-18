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
public class practice4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node four=new Node(40);

        Node head=first;
        first.next=second;
        second.next=third;
        third.next=four;

        System.out.println("Enter which elemet to Find");
        int num=sc.nextInt();

        Node current=head;
        boolean found=false;
        while(current!=null)
        {
            if(current.data==num)
            {
                found=true;
                System.out.println("Element Found="+found);
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
