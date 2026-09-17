import java.io.*;
import java.util.*;
class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Downloading...");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Network Problem");
            }
        }
    }
}
public class threadsleep 
{
    public static void main(String[]args)
    {
        MyThread a=new MyThread();
        a.start();
    }
}
