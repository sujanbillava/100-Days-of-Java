import java.io.*;
import java.util.*;
class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println("Lowest Priority");
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Highest Priority");
    }
}
public class priority 
{
    public static void main(String[]args)
    {
        MyThread1 a=new MyThread1();
        a.setPriority(3);
        MyThread2 b=new MyThread2();
        b.setPriority(8);
        a.start();
        b.start();
    }    
}
