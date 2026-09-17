import java.io.*;
import java.util.*;
class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Downloading"+(i+1));
        }
    }
}
public class threadjoin 
{
    public static void main(String[]args)
    {
        MyThread t=new MyThread();
        t.start();
        try{
            t.join();
            System.out.println("Download Completed");
        }
        catch(InterruptedException e)
        {
            System.out.println("Error Occur");
        }
    }    
}
