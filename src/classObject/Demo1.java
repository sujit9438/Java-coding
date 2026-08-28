package classObject;
import java.util.*;
class main
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        int roll=sc.nextInt();
        sc.nextLine();
        String course=sc.nextLine();
        Student3 s = new Student3 (name,roll,course);
        s.displayDetails();
    }
}
class Student3
{
    public String name;
    public int roll;
    public String course;
    public Student3(String name, int roll,String course)
    {
        if(name==null)
        {
            System.out.println("Invalid Name!");
            System.exit(0);
        }  
        else if(roll<=0)
        {
            System.out.println("Invalid Roll Number!");
            System.exit(0);
        }
         else if(course==null)
        {
            System.out.println("Invalid Course!");
            System.exit(0);
        }
        else{
this.name=name;
this.roll=roll;
this.course=course;
this.displayDetails();
        }
        
    }

    String getName()
    {
        return name;
    } 
    int getRollNo()
    {
        return roll;

    }
    String getCource()
    {
        return course;
    }
    void displayDetails()
    {
        System.out.println("Student Details:");
        System.out.println("Name: "+getName());
        System.out.println("Roll No: "+getRollNo());
        System.out.println("Course: "+getCource());
    }
}