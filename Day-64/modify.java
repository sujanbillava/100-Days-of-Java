import java.io.*;
import java.util.*;
public class modify 
{
    public static void main(String[]args)
    {
        try{
            File file=new File("students.txt");
            file.createNewFile();
            FileWriter fw=new FileWriter("students.txt");
            fw.write("Sujan\n");
            fw.write(String.valueOf(75+"\n"));
            fw.close();
            FileReader fr=new FileReader("students.txt");
            int ch;
            while((ch=fr.read())!=-1)
            {
                System.out.print((char)ch);
            }
            fr.close();
            FileWriter uw=new FileWriter("students.txt");
            uw.write("Sujan\n");
            uw.write(String.valueOf(85+"\n"));
            uw.close();
            FileReader ur=new FileReader("students.txt");
            int uch;
            while((uch=ur.read())!=-1)
            {
                System.out.print((char)uch);
            }
            ur.close();
        }
        catch(IOException e)
        {
            System.out.println("Error File");
        }

        
    }    
}
