import java.io.*;
import java.util.*;

public class  Bufferedreaderwrite
{
    public static void main(String[]args)
    {
        try{
            File file=new File("student.txt");
            file.createNewFile();
            FileWriter fw=new FileWriter("student.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Sujan\tAIML\t"+String.valueOf(95));
            bw.newLine();
            bw.write("Rahul\tCSDS\t"+String.valueOf(78));
            bw.newLine();
            bw.write("Karthik\tCSEC\t"+String.valueOf(78));
            bw.close();
            FileReader fr=new FileReader("student.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            System.out.println("Display Successfully");
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("File Error");
        }
    }
}
