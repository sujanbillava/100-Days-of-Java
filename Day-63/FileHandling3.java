import java.io.*;
import java.util.*;

public class FileHandling3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("EnterBranch");
        String branch=sc.nextLine();
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        try{
            File file=new File("student.txt");
            file.createNewFile();
            FileWriter fw=new FileWriter("student.txt");
            fw.write(name+"\n");
            fw.write(branch+"\n");
            fw.write(String.valueOf(marks)+"\n");
            fw.close();
            System.out.println("Data Stored Successfully");
            FileReader fr=new FileReader("student.txt");
            int ch;
            while((ch=fr.read())!=-1)
            {
                System.out.print((char)ch);
            }
            fr.close();

        }    
        catch(IOException e)
        {
            System.out.println("File Error");
        }
        finally{
            System.out.println("Student Record Completed");
        }
    }
}
