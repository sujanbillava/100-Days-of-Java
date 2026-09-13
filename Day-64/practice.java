import java.io.*;
import java.util.*;

public class practice
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        try{
            File file=new File("Record.txt");
            file.createNewFile();
            FileWriter fw=new FileWriter("Record.txt");
            fw.write("Sujan"+"\t"+"AIML"+"\t"+String.valueOf(85+"\n"));
            fw.write("Ram"+"\t"+"CSEC"+"\t"+String.valueOf(75+"\n"));
            fw.write("Manoj"+"\t"+"CSDS"+"\t"+String.valueOf(65+"\n"));
            fw.close();
            System.out.println("Data Entered");
            FileReader fr=new FileReader("Record.txt");
            int ch;
            while((ch=fr.read())!=-1)
            {
                System.out.print((char)ch);
            }
            fr.close();
            System.out.println("Data Displayed");
            System.out.println("Enter Which Student Mark Should be Modify");
            String name=sc.nextLine();
            System.out.println("Enter New Marks");
            int modmark=sc.nextInt();
            ArrayList<String>list=new ArrayList<>();
            FileReader ar=new FileReader("Record.txt");
            String line= "";
            int ac;
                while((ac=ar.read())!=-1)
                {
                    if(ac=='\n')
                    {
                        list.add(line);
                        line= "";
                    }
                    else
                    {
                        line=line+(char)ac;
                    }
                }
                ar.close();
            list.add(line);
            for(int i=0;i<list.size();i++)
            {
                line=list.get(i);
                if(line.contains(name))
                {
                     String part[]=line.split("\t");
                     part[2]=String.valueOf(modmark);
                     String update=part[0]+"\t"+part[1]+"\t"+part[2];
                     list.set(i,update);
                }
            }
            FileWriter uw=new FileWriter("Record.txt");
            for(int i=0;i<list.size();i++)
            {
                uw.write(list.get(i)+"\n");
            }
            uw.close();
            FileReader ur=new FileReader("Record.txt");
            int uch;
            while((uch=ur.read())!=-1)
            {
                System.out.print((char)uch);
            }
            ur.close();
            System.out.println("Updated Successfully");
        }    
        catch(IOException e)
        {
            System.out.println("File Error");
        }
    }    
}
