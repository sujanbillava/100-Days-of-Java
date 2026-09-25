import java.io.*;
import java.util.*;
class SharedData
{
    int number;
    boolean available=false;
}
class ProducerThread extends Thread
{
    SharedData sd;
    ProducerThread(SharedData sd)
    {
        this.sd=sd;
    }
    public void run()
    {
        synchronized(sd)
        {
            sd.number=100;
            sd.available=true;
            sd.notify();
        }
    }
}
class ConsumerThread extends Thread 
{
    SharedData sd;
    ConsumerThread(SharedData sd)
    {
        this.sd=sd;
    }
    public void run()
    {
        synchronized(sd)
        {
            try{
                    while(!sd.available)
                    {
                        sd.wait();
                    }
                    System.out.println("Consumed="+sd.number);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error");
            }
            
        }
    }
}
public class ThreadCommunication 
{
    public static void main(String[]args)
    {
        SharedData sd=new SharedData();
        ProducerThread pt=new ProducerThread(sd);
        ConsumerThread ct=new ConsumerThread(sd);
        pt.start();
        ct.start();
    }
}
