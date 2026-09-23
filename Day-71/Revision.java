import java.io.*;
import java.util.*;
class Data<T>
{
    T value;
    void set(T value)
    {
        this.value=value;
    }
    T get()
    {
        return value;
    }
}
class Student implements Serializable
{
    String name;
    int marks;
}
class UpdateThread extends Thread
{
    String uname;
    int umarks;
    UpdateThread(String uname,int umark)
    {
        this.uname=uname;
        this.umarks=umark;
    }
    public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Updated Student Details");
            ArrayList<String>list=new ArrayList<>();
            FileReader fr2=new FileReader("Student.txt");
            String uline="";
            int ch;
            while((ch=fr2.read())!=-1)
            {
                if(ch=='\n')
                {
                    list.add(uline);
                    uline="";
                }
                else{
                    uline=uline+(char)ch;
                }

            }
            fr2.close();
            list.add(uline);
            for(int i=0;i<list.size();i++)
            {
                String line=list.get(i);
                if(line.contains(uname))
                {
                    String part[]=line.split("\t");
                    if(part[0].equals(uname)){
                        part[1]=String.valueOf(umarks);
                        String update=part[0]+"\t"+part[1];
                        list.set(i,update);
                    }
                    
                }
            }
            FileWriter uw=new FileWriter("Student.txt");
            for(int i=0;i<list.size();i++)
            {
                uw.write(list.get(i)+"\n");
                
            }
            uw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
            
    }
}
class displayThread extends Thread
{
    public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName());
            System.out.println("Updated Student Details");
            FileReader ur=new FileReader("Student.txt");
            int ar;
            while((ar=ur.read())!=-1)
            {
                System.out.print((char)ar);
            }
            ur.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
       
    }
}

public class Revision
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        try{
            
            System.out.println("Enter Name");
            String name=sc.nextLine();
            System.out.println("Enter marks");
            int mark=sc.nextInt();
            sc.nextLine();
            Data<String>a=new Data<>();
            a.set(name);
            Data<Integer>b=new Data<>();
            b.set(mark);

            File file=new File("Student.txt");
            file.createNewFile();

            FileWriter fw=new FileWriter("Student.txt");
            fw.write(name+"\t");
            fw.write(String.valueOf(mark));
            fw.close();

            FileReader fr=new FileReader("Student.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            br.close();

            Student s=new Student();
            s.name=name;
            s.marks=mark;
            FileOutputStream fos=new FileOutputStream("Student.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            FileInputStream fis=new FileInputStream("Student.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            s=(Student)ois.readObject();
            ois.close();
            
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Error");
        }
        System.out.println("Enter Name To Update The Marks");
        String uname=sc.nextLine();
        System.out.println("Enter Update Marks");
        int umark=sc.nextInt();
        
        UpdateThread ut=new UpdateThread(uname,umark);
        ut.setName("Updated Thread");
        displayThread dt=new displayThread();
        dt.setName("Displayed Thread");
        ut.start();
        try{
            ut.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Join Cant Possible");
        }
        dt.start();

        
    }
}