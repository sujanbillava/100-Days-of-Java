import java.io.*;
import java.util.*;
public class practice 
{
    public static void main(String[] args) 
    {
        try{

            File file=new File("employee.txt");
            file.createNewFile();
            FileWriter fw=new FileWriter("employee.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Sujan\tDeveloper\t"+String.valueOf(85000));
            bw.newLine();
            bw.write("Ayush\tDesign\t"+String.valueOf(33333));
            bw.newLine();
            bw.write("Bangera\tDataScientist\t"+String.valueOf(56000));
            bw.newLine();
            bw.write("Bhuvan\tCybersecurity\t"+String.valueOf(85000));
            bw.close();
            FileReader fr=new FileReader("employee.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("File Error");
        }
    }    
}
