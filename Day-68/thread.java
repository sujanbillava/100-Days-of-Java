import java.io.*;
import java.util.*;
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Downloading File...");
    }
}
public class thread 
{
    public static void main(String[] args) 
    {
        MyThread a=new MyThread();
        a.start();    
    }
}
