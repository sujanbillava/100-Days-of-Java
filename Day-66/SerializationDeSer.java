import java.io.*;
class Student implements Serializable
{
    String name;
    String branch;
    int marks;
}
public class SerializationDeSer
{
    public static void main(String[]args)
    {
    try{
            Student s=new Student();
            s.name="Sujan";
            s.branch="AIML";
            s.marks=95;
            FileOutputStream fos=new FileOutputStream("Student.dat");
            ObjectOutputStream ous=new ObjectOutputStream(fos);
            ous.writeObject(s);
            ous.close();
            FileInputStream fis=new FileInputStream("Student.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            s=(Student)ois.readObject();
            ois.close();
            System.out.println(s.name);
            System.out.println(s.branch);
            System.out.println(s.marks);
    }
    catch(IOException | ClassNotFoundException e)
    {
        System.out.println("File Error");

    }
}
}