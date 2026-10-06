package PracticeProgram;

import java.util.Scanner;


public class UniversityStudentProfileSystem 
{
	public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner sc = new Scanner(System.in);
        String studentId=sc.next();
        String studentName=sc.next();
        String city=sc.next();
        String country=sc.next();
        double gpa=sc.nextDouble();
        if(studentId.length()<3 ||studentName.length()<3||studentName.length()>20)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        Address a= new Address(city,country);
        StudentProfile b= new StudentProfile(studentId,studentName,a,gpa);
        System.out.println("Original Student: "+b.studentId+" "+b.studentName+" "+b.address.city+" "+b.address.country+" "+b.gpa);

        StudentProfile c = b.clone();
        c.address.city="Milan";
        c.gpa+=0.5;

        System.out.println("Cloned Student: "+c.studentId+" "+c.studentName+" "+c.address.city+" "+c.address.country+" "+c.gpa);
    }
}
class Address implements Cloneable
{
    String city;
    String country;
    Address(String city,String country)
    {
        this.city=city;
        this.country=country;
    }
    public Address clone() throws CloneNotSupportedException
    {
        return (Address)super.clone();
    }
}
class StudentProfile implements Cloneable
{
    String studentId;
    String studentName;
    Address address;
    double gpa;
    StudentProfile(String studentId, String studentName,Address address, double gpa)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.address=address;
        this.gpa=gpa;
    }
    public StudentProfile clone() throws CloneNotSupportedException
    {
        StudentProfile st=(StudentProfile) super.clone();
        if(this.address!=null){
            st.address=this.address.clone();
        }
        return st;
    }
}

