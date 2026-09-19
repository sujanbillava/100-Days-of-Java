import java.io.*;
import java.util.*;
class Download extends Thread
{
    public void run()
    {
        System.out.println("Downloading...");
    }
}
class Upload extends Thread
{
    public void run()
    {
        System.out.println("Uploading...");
    }
}
class Processing extends Thread
{
    public void run()
    {
        System.out.println("Processing...");
    }
}
public class multiplethread 
{
    public static void main(String[]args)
    {
        Download d=new Download();
        Upload u=new Upload();
        Processing p=new Processing();
        d.start();
        u.start();
        p.start();
    }    
}
