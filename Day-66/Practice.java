import java.io.*;
class Employee implements Serializable
{
    String name;
    String department;
    int salary;
}
public class Practice 
{
    public static void main(String[] args) 
    {
        try{
            Employee emp=new Employee();
            emp.name="Sujan";
            emp.department="Developer";
            emp.salary=75000;
            FileOutputStream fos=new FileOutputStream("Employee.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            FileInputStream fis=new FileInputStream("Employee.dat");
            ObjectInputStream ois=new ObjectInputStream(fis);
            emp=(Employee)ois.readObject();
            ois.close();
            System.out.println(emp.name);
            System.out.println(emp.department);
            System.out.println(emp.salary);
        }   
        catch(IOException | ClassNotFoundException e)
        {
            System.out.println("File Error");
        } 
    
    }   
}
