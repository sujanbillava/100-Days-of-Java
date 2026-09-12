import java.io.*;
import java.util.*;

public class FileHandling2 
{
    public static void main(String[] args) 
    {
        try{
            FileReader fr=new FileReader("marks.txt");
            int ch;
            while((ch=fr.read())!=-1)
            {
                System.out.println((char)ch);
            }
            fr.close();
            System.out.print("Reading Completed");
        }  
        catch(IOException e)
        {
            System.out.println("File Error");
        }  
    }
}
