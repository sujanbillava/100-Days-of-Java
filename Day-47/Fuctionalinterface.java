import java.util.*;
import java.util.function.*;
class Student
{
    String name;
    int age;
    double marks;
    Student(String name,int age,double marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public String toString()
    {
        return name+"-"+age+"-"+marks;
    }
}
public class Fuctionalinterface 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Name");
            String name=sc.nextLine();
            System.out.println("Enter age");
            int age=sc.nextInt();
            System.out.println("Enter marks");
            double marks=sc.nextDouble();
            sc.nextLine();
            Student obj=new Student(name,age,marks);
            list.add(obj);

        }
        System.out.println(list);
        for(int i=0;i<5;i++)
        {
            Predicate<Student>eligible=s-> s.marks>=45;
            System.out.println(eligible.test(list.get(i)));
            Consumer<Student> display=s-> System.out.println(s);
            display.accept(list.get(i));
            Function<Student,String>getname= s-> s.name;
            System.out.println(getname.apply(list.get(i)));
            Supplier<String> clg=()->"Gitam University";
            System.out.println(clg.get());
       
        }
        
    }
}
