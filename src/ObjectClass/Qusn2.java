package ObjectClass;

import java.util.Scanner;

public class Qusn2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int studentId=sc.nextInt();
        if(studentId<0)
        {
            System.out.println("Error: Student ID must be greater than zero");
            System.exit(0);
        }
        sc.nextLine();
        String name=sc.nextLine();
        String cource=sc.nextLine();
        Student a=new Student(studentId,name,cource);

        int studentId2=sc.nextInt();
        sc.nextLine();
        String name2=sc.nextLine();
        String cource2=sc.nextLine();
        Student b=new Student(studentId2,name2,cource2);

        if(a.equals(b))
        {
            System.out.println("Students are equal");
        }
        else
        {
            System.out.println("Students are not equal");
        }
	}

}
class Student
{
    public int studentId;
    public String name;
    public String cource;
    public Student(int studentId,String name,String cource)
    {
        this.studentId=studentId;
        this.name=name;
        this.cource=cource;
    }
    public boolean equals(Object o)
    {
        Student temp=(Student) o;
        return this.studentId==temp.studentId;
    }
}

