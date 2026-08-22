import java.util.*;
class Student implements Comparable<Student>
{
    String name;
    int age;
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student other)
    {
        if(this.age==other.age)
        {
             return this.name.compareTo(other.name);
        }
        return this.age-other.age;
    }
    public String toString()
    {
        return name+"-"+age;
    }
}

public class replace 
{
    public static void main(String[]args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Name");
            String name=sc.nextLine();
            System.out.println("Enter Age");
            int age=sc.nextInt();
            sc.nextLine();
            Student obj=new Student(name,age);
            list.add(obj);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }   
}
