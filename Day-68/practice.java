import java.io.*;
import java.util.*;
class MyThread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Downloading"+(i+1));
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Failed");
            }
        }
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Processing File");
    }
}
public class practice 
{
    public static void main(String[] args) 
    {
        MyThread1 a=new MyThread1();
        a.setPriority(5);
        a.start();
        MyThread2 b=new MyThread2();
        b.setPriority(8);
        b.start();
        try{
            a.join();
            System.out.println("Download Completed");
        }
        catch(InterruptedException e)
        {
            System.out.println("Download Error");
        }

    }    
}
