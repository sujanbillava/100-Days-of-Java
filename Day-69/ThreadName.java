import java.io.*;
import java.util.*;
class MyThread extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadName 
{
    public static void main(String[] args) 
    {
        MyThread t=new MyThread();
        t.setName("DownloadThread");
        t.start();    
    }    
}
