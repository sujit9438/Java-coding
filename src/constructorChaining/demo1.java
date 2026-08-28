package constructorChaining;

public class demo1 {

	public static void main(String[] args) 
	{
		student01 s1=new student01("abhi",501,21,98.34);
		student01 s2=new student01("suma",505,36,78.76,"hgy");
		s1.displayDetails();
		System.out.println("---------------------------------");
		s2.displayDetails();
		
	}

}
class student01
{
	public String name;
	public int studentId;
	public int age;
	public double percentage;
	public String city;
	public student01(String name,int studentId,int age,double percentage)
	{
		this.name=name;
		this.studentId=studentId;
		this.age=age;
		this.percentage=percentage;
	}
	public student01(String name,int studentId,int age,double percentage,String city)
	{
		this(name,studentId,age,percentage);
		this.city=city;
	}
	public void displayDetails()
	{
		System.out.println("name"+name);
		System.out.println("Student id"+studentId);
		System.out.println("age"+age);
		System.out.println("percentage"+percentage);
		System.out.println("city"+city);
	}
	
	
}
