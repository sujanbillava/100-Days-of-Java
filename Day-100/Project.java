import java.io.*;
import java.util.*;
class Student
{
    int ID;
    String name;
    int marks;
    public  Student(int ID,String name,int marks)
    {
        this.ID=ID;
        this.name=name;
        this.marks=marks;
        
    }
    void display()
    {
        System.out.println("ID="+ID);
        System.out.println("Name="+name);
        System.out.println("Marks="+marks);
    }
}
public class Project 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student>list=new ArrayList<>();
        Student obj=new Student(101,"Sujan",86);
        Student obj2=new Student(102,"Roopesh",96);
        list.add(obj);
        list.add(obj2);
        int choice=0;
        while(choice!=7)
        {
            
            System.out.println("======Student Management System======");
            System.out.println("1. Diaplay Students");
            System.out.println("2. Search Student");
            System.out.println("3. Add Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Show Grade");
            System.out.println("7. Exit");
            System.out.println("Enter Your Choice");
             choice=sc.nextInt();
          
            switch(choice)
            {
                case 1:
                    for(Student s:list)
                    {
                        s.display();
                    }
                    break;

                case 2:
                    System.out.println("Enter Student ID to search");
                    int id=sc.nextInt();
                    boolean found=false;
                    for(Student s:list)
                    {
                        if(s.ID==id)
                        {
                            found=true;
                            s.display();
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Student Details Not Found!!!");
                    }
                    break;

                case 3:
                    System.out.println("Enter New ID");
                    int newid=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Name");
                    String newname=sc.nextLine();
                    System.out.println("Enter Student Marks");
                    int stdmark=sc.nextInt();
                    Student obj3=new Student(newid,newname,stdmark);
                    list.add(obj3);
                    for(Student s:list)
                    {
                        s.display();
                    }
                    break;

                case 4:
                    System.out.println("Enter Student ID to update profile");
                    int stid=sc.nextInt();
                    System.out.println("Enter New Marks");
                    int newmarks=sc.nextInt();
                    boolean stdfound=false;
                    for(Student s:list)
                    {
                        if(s.ID==stid)
                        {
                            stdfound=true;
                            s.marks=newmarks;
                        }
                    }
                    if(!stdfound)
                    {
                        System.out.println("Not Found Details");
                    }
                    for(Student s:list)
                    {
                        s.display();
                    }
                    break;

                
                case 5:
                    System.out.println("Enter Student ID to Delete");
                    int delid=sc.nextInt();
                    Student student=null;
                    boolean deleteid=false;
                    for(Student s:list)
                    {
                        if(s.ID==delid)
                        {
                            deleteid=true;
                            student=s;
                        }
                    }
                    if(!deleteid)
                    {
                        System.out.println("ID Not Found");
                    }
                    else{
                        list.remove(student);
                    }
                    for(Student s:list)
                    {
                        s.display();
                    }
                    break;


                case 6:
                    System.out.println("Enter Student ID To Search his Grade");
                    int gradeid=sc.nextInt();
                    boolean gradefound=false;
                    for(Student s:list)
                    {
                        if(s.ID==gradeid)
                        {
                            gradefound=true;
                            if(s.marks>=90)
                            {
                                System.out.println("A");
                            }
                            else if(s.marks>=75)
                            {
                                System.out.println("B");
                            }
                            else if(s.marks>=35)
                            {
                                System.out.println("C");
                            }
                            else{
                                System.out.println("F");
                            }
                        }
                    }
                    if(!gradefound)
                    {
                        System.out.println("ID Not Found");
                    }
                    break;
                
                case 7:
                    System.out.println("=======Exit======");
                    break;
                    
                default:{
                    System.out.println("Choice is Not Found");
                }
            }  
        }
        
    }    
}
