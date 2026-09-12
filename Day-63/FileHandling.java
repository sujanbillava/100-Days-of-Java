import java.io.*;
import java.util.*;
public class FileHandling
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Marks");
        int mark=sc.nextInt();
        try{
            File file=new File("marks.txt");
            file.createNewFile();
            System.out.println("File Created Successfully"); 
            FileWriter fw=new FileWriter("marks.txt");
            fw.write(name+"\n");
            fw.write(String.valueOf(mark));
            fw.close();
            System.out.println("Data Written Successfully");
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
        finally{
            System.out.println("Successfully Run");
        }

        
    }
}